package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderChecked extends AbstractEvent {

    private Long id;
    private String state;
    private String productId;
    private String customerId;

    public OrderChecked(Order aggregate){
        super(aggregate);
    }
    public OrderChecked(){
        super();
    }
}
