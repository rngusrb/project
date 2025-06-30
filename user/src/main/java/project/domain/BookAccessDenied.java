package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;


@Data
@ToString
public class BookAccessDenied extends AbstractEvent {
    private Long userId;
    private String bookId;

    public BookAccessDenied(Long userId, String bookId) {
        super();
        this.userId = userId;
        this.bookId = bookId;
    }

    public BookAccessDenied() {
        super();
    }
}