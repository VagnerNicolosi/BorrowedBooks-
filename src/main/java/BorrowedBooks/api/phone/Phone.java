package BorrowedBooks.api.phone;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_phones")
@Entity(name = "Phone")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idTbPhone")

public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long idTbPhone;
    private String ddd;
    private String phone_number;

    public Phone(SavePhone data) {
        this.ddd = data.ddd();
        this.phone_number = data.phone_number();
    }

    public void UpdatePhone(UpdatePhone data) {
        if (data.ddd() != null) {
            this.ddd = data.ddd();
        }
        if (data.phone_number() != null) {
            this.phone_number = data.phone_number();
        }
    }
}
