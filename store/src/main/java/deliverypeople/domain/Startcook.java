package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Startcook extends AbstractEvent {

    private Long id;
    private String state;
    private String productId;
    private String customerId;

    public Startcook(Store aggregate){
        super(aggregate);
    }
    public Startcook(){
        super();
    }
}
