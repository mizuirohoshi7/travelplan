package travelplan.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import travelplan.domain.*;

@RepositoryRestResource(collectionResourceRel = "plans", path = "plans")
public interface PlanRepository
    extends PagingAndSortingRepository<Plan, Long> {}
