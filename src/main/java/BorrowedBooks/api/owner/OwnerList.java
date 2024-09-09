package BorrowedBooks.api.owner;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record OwnerList(Long idTbOwner, String firstName, String email) {
    public OwnerList(Owner owner){
        this(owner.getIdTbOwner(),owner.getFirstName(), owner.getEmail());
    }
}
