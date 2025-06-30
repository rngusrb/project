package project.domain;


import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointChargeRequest extends AbstractEvent {

    private Integer amount;
}
//>>> DDD / Domain Event