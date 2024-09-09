package BorrowedBooks.api.book;

import jakarta.validation.constraints.NotBlank;

public record SaveBook(
        long TbWriter_id,
        @NotBlank String title,
        @NotBlank String isbn,
        @NotBlank   String edition,
        @NotBlank  String pages,
        @NotBlank String publisher,
        boolean rent
) {
}
