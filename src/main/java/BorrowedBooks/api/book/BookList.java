package BorrowedBooks.api.book;

public record BookList(Long idTbBook, Long TbWriter_id, String title, String isbn, String edition, String pages, String publisher) {
    public BookList(Book book){this(book.getIdTbBook(), book.getTbWriter_id(), book.getTitle(), book.getIsbn(), book.getEdition(), book.getPages(), book.getPublisher());}
}
