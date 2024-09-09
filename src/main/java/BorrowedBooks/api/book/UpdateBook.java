package BorrowedBooks.api.book;

public record UpdateBook(Long idTbBook, Long TbWriter_id, String title, String isbn, String edition, String pages, String publisher, Boolean rent) {
}
