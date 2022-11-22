package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Startdelivery extends AbstractEvent {

    private Long id;
    private String state;
    private String customerId;
    private String productId;
    private String riderId;
}


