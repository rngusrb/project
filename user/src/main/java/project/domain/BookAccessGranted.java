package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;


@Data
@ToString
public class BookAccessGranted extends AbstractEvent {
    private Long userId;
    private String bookId;

    public BookAccessGranted(Long userId, String bookId) {
        super();
        this.userId = userId;
        this.bookId = bookId;
    }

    public BookAccessGranted() {
        super();
    }
}
