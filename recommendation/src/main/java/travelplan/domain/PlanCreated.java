package travelplan.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import travelplan.infra.AbstractEvent;

@Data
public class PlanCreated extends AbstractEvent {

    private Long id;
    private Long memberId;
    private String location;
    private Date startDay;
    private Date endDay;
    private Integer budget;
    private Integer groupSize;
    private String details;
}
