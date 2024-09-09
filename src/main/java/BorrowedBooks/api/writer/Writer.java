package BorrowedBooks.api.writer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_writers")
@Entity(name = "Writer")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idTbWriter")

public class Writer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long idTbWriter;
    private String name;
    private long friend_id;

    public Writer(SaveWriter data) {
        this.name = data.name();
        this.friend_id = data.friend_id();
    }

    public void UpdateWriter(UpdateWriter data) {
        if (data.name() != null) {
            this.name = data.name();
        }
        if (data.friend_id() != null) {
            this.friend_id = data.friend_id();
        }
    }
}
