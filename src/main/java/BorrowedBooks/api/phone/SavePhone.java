package BorrowedBooks.api.phone;

import jakarta.validation.constraints.NotBlank;

public record SavePhone(
        @NotBlank String ddd,
        @NotBlank String phone_number) {
}
