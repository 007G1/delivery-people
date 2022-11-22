package deliverypeople.domain;

import deliverypeople.domain.Checked;
import deliverypeople.domain.Picked;
import deliverypeople.domain.Startdelivery;
import deliverypeople.domain.Enddelivery;
import deliverypeople.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Delivery_table")
@Data

public class Delivery  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String state;
    
    
    
    
    
    private String riderId;

    @PostPersist
    public void onPostPersist(){


        Checked checked = new Checked(this);
        checked.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        deliverypeople.external.Delivery delivery = new deliverypeople.external.Delivery();
        // mappings goes here
        DeliveryApplication.applicationContext.getBean(deliverypeople.external.DeliveryService.class)
            .start(delivery);


        Picked picked = new Picked(this);
        picked.publishAfterCommit();



        Startdelivery startdelivery = new Startdelivery(this);
        startdelivery.publishAfterCommit();



        Enddelivery enddelivery = new Enddelivery(this);
        enddelivery.publishAfterCommit();

    }

    public static DeliveryRepository repository(){
        DeliveryRepository deliveryRepository = DeliveryApplication.applicationContext.getBean(DeliveryRepository.class);
        return deliveryRepository;
    }






}
