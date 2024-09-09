package BorrowedBooks.api.writer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UpdateWriter(@NotNull Long idTbWriter, @NotBlank String name, Long friend_id) {
}
