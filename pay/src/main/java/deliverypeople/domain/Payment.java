package deliverypeople.domain;

import deliverypeople.domain.Payplaced;
import deliverypeople.PayApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Payment_table")
@Data

public class Payment  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String state;
    
    
    
    
    
    private Integer cost;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String customerId;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        deliverypeople.external.Store store = new deliverypeople.external.Store();
        // mappings goes here
        PayApplication.applicationContext.getBean(deliverypeople.external.StoreService.class)
            .start(store);


        Payplaced payplaced = new Payplaced(this);
        payplaced.publishAfterCommit();

    }

    public static PaymentRepository repository(){
        PaymentRepository paymentRepository = PayApplication.applicationContext.getBean(PaymentRepository.class);
        return paymentRepository;
    }






}
