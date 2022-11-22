package deliverypeople.domain;

import deliverypeople.domain.*;
import deliverypeople.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Checked extends AbstractEvent {

    private Long id;

    public Checked(Delivery aggregate){
        super(aggregate);
    }
    public Checked(){
        super();
    }
}
