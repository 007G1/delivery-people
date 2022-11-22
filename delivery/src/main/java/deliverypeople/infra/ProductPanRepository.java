package deliverypeople.infra;

import deliverypeople.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="productPans", path="productPans")
public interface ProductPanRepository extends PagingAndSortingRepository<ProductPan, Long> {

    

    
}
