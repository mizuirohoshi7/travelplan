package travelplan.domain;

import travelplan.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="likes", path="likes")
public interface LikeRepository extends PagingAndSortingRepository<Like, >{
}