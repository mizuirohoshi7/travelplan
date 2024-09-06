package travelplan.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import travelplan.domain.*;
import travelplan.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RecommendationRequired extends AbstractEvent {

    private Long id;
    private Long memberId;
    private String location;
    private Date travelDate;
    private Integer budget;
    private Integer groupSize;

    public RecommendationRequired(Plan aggregate) {
        super(aggregate);
    }

    public RecommendationRequired() {
        super();
    }
}
//>>> DDD / Domain Event
