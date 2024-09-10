package travelplan.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import travelplan.domain.*;
import travelplan.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PlanDeleted extends AbstractEvent {

    private Long id;
    private Long memberId;
    private String location;
    private Date startDay;
    private Date endDay;
    private Integer budget;
    private Integer groupSize;
    private String details;

    public PlanDeleted(Plan aggregate) {
        super(aggregate);
    }

    public PlanDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
