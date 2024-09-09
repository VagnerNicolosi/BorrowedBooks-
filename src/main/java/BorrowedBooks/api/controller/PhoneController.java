package BorrowedBooks.api.controller;

import BorrowedBooks.api.phone.Phone;
import BorrowedBooks.api.phone.PhoneRepository;
import BorrowedBooks.api.phone.SavePhone;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phone")
public class PhoneController {
    @Autowired
    private PhoneRepository repository;
    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid SavePhone data){
        repository.save(new Phone(data));
    }
}
