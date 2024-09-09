package BorrowedBooks.api.friend;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_friends")
@Entity(name = "Friend")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idTbFriend")

public class Friend {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long idTbFriend;
    private Boolean activie;
    private String name;
    private String email;
    private String phone;

    public Friend(SaveFriend data) {
        this.activie = true;
        this.name = data.name();
        this.email = data.email();
        this.phone = data.phone();
    }

    public void UpdateFriend(UpdateFriend data) {
        if (data.name() != null) {
            this.name = data.name();
        }
        if (data.email() != null) {
            this.email = data.email();
        }
        if (data.phone() != null) {
            this.phone = data.phone();
        }
    }

    public void Delete(){
        this.activie = false;
    }
}
