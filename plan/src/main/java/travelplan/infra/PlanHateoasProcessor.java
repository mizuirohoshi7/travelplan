package travelplan.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import travelplan.domain.*;

@Component
public class PlanHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Plan>> {

    @Override
    public EntityModel<Plan> process(EntityModel<Plan> model) {
        return model;
    }
}
