package BorrowedBooks.api.owner;

import jakarta.validation.constraints.NotNull;

public record UpdateOwnerData(@NotNull Long idTbOwner, String firstName, String email) {

}
