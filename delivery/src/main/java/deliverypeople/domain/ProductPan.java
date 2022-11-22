package deliverypeople.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="ProductPan_table")
@Data
public class ProductPan {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String product;
        private String state;


}