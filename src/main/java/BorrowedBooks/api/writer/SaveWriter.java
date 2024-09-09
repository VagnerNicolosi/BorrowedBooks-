package BorrowedBooks.api.writer;

import jakarta.validation.constraints.NotBlank;

public record SaveWriter(@NotBlank String name, Long friend_id) {
}
