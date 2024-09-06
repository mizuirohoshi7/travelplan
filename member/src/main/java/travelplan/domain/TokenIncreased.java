package travelplan.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import travelplan.domain.*;
import travelplan.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TokenIncreased extends AbstractEvent {

    private Long id;
    private String oauthId;
    private String name;
    private String email;
    private Integer tokenAmount;

    public TokenIncreased(Member aggregate) {
        super(aggregate);
    }

    public TokenIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
