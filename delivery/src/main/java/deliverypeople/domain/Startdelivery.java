package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Startdelivery extends AbstractEvent {

    private Long id;
    private String state;
    private String customerId;
    private String productId;
    private String riderId;

    public Startdelivery(Delivery aggregate){
        super(aggregate);
    }
    public Startdelivery(){
        super();
    }
}
