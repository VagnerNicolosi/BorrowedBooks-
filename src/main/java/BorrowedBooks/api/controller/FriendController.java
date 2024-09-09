package BorrowedBooks.api.controller;

import BorrowedBooks.api.friend.Friend;
import BorrowedBooks.api.friend.FriendRespository;
import BorrowedBooks.api.friend.SaveFriend;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/friend")
public class FriendController {
    @Autowired
    private FriendRespository repository;
    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid SaveFriend data){
        repository.save(new Friend(data));
    }
}
