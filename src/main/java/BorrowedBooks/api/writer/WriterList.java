package BorrowedBooks.api.writer;

import BorrowedBooks.api.friend.Friend;
import BorrowedBooks.api.friend.FriendList;

public record WriterList(Long idTbWriter, String name, Long friend_id) {
    public WriterList (Writer writer){this(writer.getIdTbWriter(), writer.getName(), writer.getFriend_id());}
}
