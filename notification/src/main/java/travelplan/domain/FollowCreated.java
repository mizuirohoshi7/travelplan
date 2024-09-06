package travelplan.domain;

import java.util.*;
import lombok.*;
import travelplan.domain.*;
import travelplan.infra.AbstractEvent;

@Data
@ToString
public class FollowCreated extends AbstractEvent {

    private Long id;
    private Long fromId;
    private Long toId;
}
