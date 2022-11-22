package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Orderplaced extends AbstractEvent {

    private Long id;
    private String productId;
    private String customerId;
    private Integer qty;

    public Orderplaced(Order aggregate){
        super(aggregate);
    }
    public Orderplaced(){
        super();
    }
}
