package deliverypeople.external;

import lombok.Data;
import java.util.Date;
@Data
public class Delivery {

    private Long id;
    private String customerId;
    private String productId;
    private String state;
    private String riderId;
}


