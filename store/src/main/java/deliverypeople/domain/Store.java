package deliverypeople.domain;

import deliverypeople.domain.Startcook;
import deliverypeople.domain.Endcook;
import deliverypeople.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Store_table")
@Data

public class Store  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String state;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String customerId;

    @PostPersist
    public void onPostPersist(){


        Startcook startcook = new Startcook(this);
        startcook.publishAfterCommit();



        Endcook endcook = new Endcook(this);
        endcook.publishAfterCommit();

    }

    public static StoreRepository repository(){
        StoreRepository storeRepository = StoreApplication.applicationContext.getBean(StoreRepository.class);
        return storeRepository;
    }






}
