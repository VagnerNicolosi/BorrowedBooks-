package BorrowedBooks.api.friend;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRespository extends JpaRepository<Friend, Long> {
    Page<Friend> findAllByActivieTrue(Pageable pagination);
}
