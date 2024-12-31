package com.quanghuyfs.booknetwork.feedback;

import lombok.Builder;

@Builder
public record FeedbackResponse(
        Double rate,
        String comment,
        boolean ownFeedback
) {
}
