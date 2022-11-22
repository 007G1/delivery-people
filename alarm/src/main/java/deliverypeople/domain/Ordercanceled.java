package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Ordercanceled extends AbstractEvent {

    private Long id;
    private String productId;
    private String customerId;
    private Integer qty;
}


