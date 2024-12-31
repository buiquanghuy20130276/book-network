package com.quanghuyfs.booknetwork.feedback;

import com.quanghuyfs.booknetwork.book.Book;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class FeedbackMapper {
    public Feedback toFeedback(FeedbackRequest request){
        return Feedback.builder()
                .rate(request.rate())
                .comment(request.comment())
                .book(Book.builder()
                        .id(request.bookId())
                        .archived(false)
                        .shareable(false)
                        .build())

                .build();
    }

    public FeedbackResponse toFeedbackResponse(Feedback f, Integer userid) {
        return FeedbackResponse.builder()
                .rate(f.getRate())
                .comment(f.getComment())
                .ownFeedback(Objects.equals(f.getCreatedBy(),userid))
                .build();
    }
}
