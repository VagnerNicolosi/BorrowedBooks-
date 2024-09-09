package BorrowedBooks.api.phone;

import BorrowedBooks.api.owner.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
