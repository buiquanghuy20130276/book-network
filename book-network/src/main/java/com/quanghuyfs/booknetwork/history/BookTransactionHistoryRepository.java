package com.quanghuyfs.booknetwork.history;

import com.quanghuyfs.booknetwork.book.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookTransactionHistoryRepository extends JpaRepository<BookTransactionHistory,Integer> {
    @Query("select history from BookTransactionHistory  history where history.user.id=:userId")
    Page<BookTransactionHistory> findAllBorrowedBooks(Object pageable, Integer userId);

}
