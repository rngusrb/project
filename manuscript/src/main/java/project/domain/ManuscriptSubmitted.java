package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ManuscriptSubmitted extends AbstractEvent {

    private Long id;

    public ManuscriptSubmitted(Manuscript aggregate) {
        super(aggregate);
    }

    public ManuscriptSubmitted() {
        super();
    }
}
//>>> DDD / Domain Event
