package deliverypeople.domain;

import deliverypeople.domain.Orderplaced;
import deliverypeople.domain.Ordercanceled;
import deliverypeople.domain.OrderChecked;
import deliverypeople.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Order_table")
@Data

public class Order  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private Double amount;
    
    
    
    
    
    private String state;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        deliverypeople.external.Payment payment = new deliverypeople.external.Payment();
        // mappings goes here
        OrderApplication.applicationContext.getBean(deliverypeople.external.PaymentService.class)
            .pay(payment);


        Orderplaced orderplaced = new Orderplaced(this);
        orderplaced.publishAfterCommit();



        Ordercanceled ordercanceled = new Ordercanceled(this);
        ordercanceled.publishAfterCommit();



        OrderChecked orderChecked = new OrderChecked(this);
        orderChecked.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
