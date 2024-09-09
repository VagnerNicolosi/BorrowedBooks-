package BorrowedBooks.api.book;

import BorrowedBooks.api.friend.Friend;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRespository extends JpaRepository<Book, Long> {
    Page<Book> findAll(Pageable pagination);
}
