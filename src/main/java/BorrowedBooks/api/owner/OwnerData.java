package BorrowedBooks.api.owner;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record OwnerData(
        @NotBlank
        String firstName,
        @NotBlank @Email
        String email) {
}
