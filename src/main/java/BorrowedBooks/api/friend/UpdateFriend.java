package BorrowedBooks.api.friend;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UpdateFriend(@NotNull Long idTbFriend, @NotBlank String name, @NotBlank String email,@NotBlank String phone) {
}
