package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Ordercanceled extends AbstractEvent {

    private Long id;
    private String productId;
    private String customerId;
    private Integer qty;

    public Ordercanceled(Order aggregate){
        super(aggregate);
    }
    public Ordercanceled(){
        super();
    }
}
