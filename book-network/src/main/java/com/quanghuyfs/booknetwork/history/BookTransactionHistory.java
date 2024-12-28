package com.quanghuyfs.booknetwork.history;

import com.quanghuyfs.booknetwork.book.Book;
import com.quanghuyfs.booknetwork.common.BaseEntity;
import com.quanghuyfs.booknetwork.user.User;
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
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookTransactionHistory extends BaseEntity {
    //user relationship
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    //book relationship
    private Book book;
    private boolean returned;
    private boolean returnApproved;


}
