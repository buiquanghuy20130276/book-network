package com.quanghuyfs.booknetwork.book;

import lombok.Builder;

@Builder
public record ReturnedBookResponse(
        Integer id,
        String title,
        String authorName,
        String isbn,
        double rate,
        boolean returned,
        boolean returnApproved
) {
}
