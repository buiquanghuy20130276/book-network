package com.quanghuyfs.booknetwork.history;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookTransactionHistoryRepository extends JpaRepository<BookTransactionHistory,Integer> {
    @Query("select history from BookTransactionHistory  history where history.user.id=:userId")
    Page<BookTransactionHistory> findAllBorrowedBooks(Object pageable, Integer userId);
    @Query("select history from BookTransactionHistory  history where history.book.owner.id=:userId")

    Page<BookTransactionHistory> finAllReturnedBooks(Pageable pageable, Integer userId);
    @Query("select (count(*)> 0) as isBorrowed from BookTransactionHistory history where history.user.id=:userId and history.book.id=:bookId and history.returnApproved=false")

    boolean isAlreadyBorrowedBookByUser(Integer bookId, Integer userId);
    @Query("select transaction from BookTransactionHistory  transaction where transaction.user.id=:userId and transaction.book.id= :bookId and transaction.returned=false and transaction.returnApproved =false ")
    Optional<BookTransactionHistory> findByBookIdAndUserId(Integer bookId, Integer userId);
    @Query("select transaction from BookTransactionHistory  transaction where transaction.book.owner.id=:ownerId and transaction.book.id= :bookId and transaction.returned=true and transaction.returnApproved =false ")
    Optional<BookTransactionHistory> findByBookIdAndOwnerId(Integer bookId, Integer ownerId);
}
