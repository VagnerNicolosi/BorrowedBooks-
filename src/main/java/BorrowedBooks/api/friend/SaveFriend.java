package BorrowedBooks.api.friend;

import jakarta.validation.constraints.NotBlank;

public record SaveFriend(@NotBlank String name, @NotBlank String email, String phone) {
}
