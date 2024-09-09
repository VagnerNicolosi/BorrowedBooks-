package BorrowedBooks.api.owner;

//import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_owners")
@Entity(name = "Owner")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idTbOwner")

public class Owner {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long idTbOwner;
    private Boolean activie;
    private String firstName;
    private String email;

    public Owner(OwnerData data) {
        this.activie = true;
        this.firstName = data.firstName();
        this.email = data.email();
    }
    public void UpdateOwnerData(UpdateOwnerData data) {
        if (data.firstName() != null) {
            this.firstName = data.firstName();
        }
        if (data.email() != null) {
            this.email = data.email();
        }
    }
    public void Delete(){
        this.activie = false;
    }
}
