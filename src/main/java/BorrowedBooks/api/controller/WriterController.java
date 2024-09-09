package BorrowedBooks.api.controller;


import BorrowedBooks.api.writer.SaveWriter;
import BorrowedBooks.api.writer.Writer;
import BorrowedBooks.api.writer.WriterRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/writer")
public class WriterController {
    @Autowired
    private WriterRepository repository;
    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid SaveWriter data){
        repository.save(new Writer(data));
    }
}
