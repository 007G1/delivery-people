package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Payplaced extends AbstractEvent {

    private Long id;
    private String state;
    private String productId;
    private String customerId;

    public Payplaced(Payment aggregate){
        super(aggregate);
    }
    public Payplaced(){
        super();
    }
}
