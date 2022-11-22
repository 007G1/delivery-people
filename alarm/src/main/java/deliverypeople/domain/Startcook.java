package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Startcook extends AbstractEvent {

    private Long id;
    private String state;
    private String productId;
    private String customerId;
}


