package com.quanghuyfs.booknetwork.feedback;

import com.quanghuyfs.booknetwork.book.Book;
import com.quanghuyfs.booknetwork.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class FeedBack extends BaseEntity {
    private Double node;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
