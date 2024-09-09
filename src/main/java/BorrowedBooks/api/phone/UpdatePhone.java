package BorrowedBooks.api.phone;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UpdatePhone(
        @NotNull Long idTbPhone,
        @NotBlank String ddd,
        @NotBlank String phone_number) {
}
