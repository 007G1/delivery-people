package deliverypeople.domain;

import deliverypeople.domain.Orderplaced;
import deliverypeople.MonolithApplication;
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
    
    
    
    
    
    private Integer qty;

    @PostPersist
    public void onPostPersist(){


        Orderplaced orderplaced = new Orderplaced(this);
        orderplaced.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = MonolithApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
