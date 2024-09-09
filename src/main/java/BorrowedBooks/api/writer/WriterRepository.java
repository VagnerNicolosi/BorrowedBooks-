package BorrowedBooks.api.writer;

import BorrowedBooks.api.friend.Friend;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WriterRepository extends JpaRepository<Writer, Long> {
    Page<Writer> findAll(Pageable pagination);
}
