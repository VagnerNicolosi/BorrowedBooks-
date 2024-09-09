package BorrowedBooks.api.phone;

import BorrowedBooks.api.owner.Owner;

public record PhoneList(
        Long idTbPhone,
        String ddd,
        String phone_number) {
    public PhoneList(Phone phone){
        this(phone.getIdTbPhone(),phone.getDdd(), phone.getPhone_number());
    }

}
