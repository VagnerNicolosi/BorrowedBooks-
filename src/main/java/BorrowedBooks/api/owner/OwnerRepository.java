package BorrowedBooks.api.owner;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long>{

    Page<Owner> findAllByActivieTrue(Pageable pagination);
}
