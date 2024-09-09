package BorrowedBooks.api.book;

import BorrowedBooks.api.owner.UpdateOwnerData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_books")
@Entity(name = "Book")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idTbBook")

public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long idTbBook;
    private long TbWriter_id;
    private String title;
    private String isbn;
    private String edition;
    private String pages;
    private String publisher;
    private boolean rent;

    public Book(SaveBook data) {
        this.rent = false;
        this.TbWriter_id = data.TbWriter_id();
        this.title = data.title();
        this.isbn = data.isbn();
        this.edition = data.edition();
        this.pages = data.pages();
        this.publisher = data.publisher();
    }

    public void UpdateBook(UpdateBook data) {
        if (data.title() != null) {
            this.title = data.title();
        }
        if (data.TbWriter_id() != null) {
            this.TbWriter_id = data.TbWriter_id();
        }
        if (data.rent() != null) {
            this.rent = data.rent();
        }
        if (data.isbn() != null) {
            this.isbn = data.isbn();
        }
        if (data.edition() != null) {
            this.edition = data.edition();
        }
        if (data.pages() != null) {
            this.pages = data.pages();
        }
        if (data.publisher() != null) {
            this.publisher = data.publisher();
        }

    }

}
