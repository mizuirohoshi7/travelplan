package travelplan.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import travelplan.domain.*;
import travelplan.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MemberCreated extends AbstractEvent {

    private Long id;
    private String oauthId;
    private String name;
    private String email;
    private Integer tokenAmount;

    public MemberCreated(Member aggregate) {
        super(aggregate);
    }

    public MemberCreated() {
        super();
    }
}
//>>> DDD / Domain Event
