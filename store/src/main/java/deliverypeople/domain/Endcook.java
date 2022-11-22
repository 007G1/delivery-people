package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Endcook extends AbstractEvent {

    private Long id;
    private String state;
    private String productId;
    private String customerId;

    public Endcook(Store aggregate){
        super(aggregate);
    }
    public Endcook(){
        super();
    }
}
