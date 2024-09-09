package BorrowedBooks.api.controller;

import BorrowedBooks.api.book.Book;
import BorrowedBooks.api.book.BookRespository;
import BorrowedBooks.api.book.SaveBook;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRespository repository;
    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid SaveBook data){
        repository.save(new Book(data));
    }
}
