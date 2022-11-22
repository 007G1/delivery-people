package deliverypeople.external;

import lombok.Data;
import java.util.Date;
@Data
public class Payment {

    private Long id;
    private String state;
    private Integer cost;
    private String productId;
    private String customerId;
}


