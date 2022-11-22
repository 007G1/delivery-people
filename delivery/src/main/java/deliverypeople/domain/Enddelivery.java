package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Enddelivery extends AbstractEvent {

    private Long id;
    private String customerId;
    private String productId;
    private String riderId;
    private String state;

    public Enddelivery(Delivery aggregate){
        super(aggregate);
    }
    public Enddelivery(){
        super();
    }
}
