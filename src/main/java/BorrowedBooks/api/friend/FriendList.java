package BorrowedBooks.api.friend;


public record FriendList(Long idTbFriend, String name, String email,String phone) {
    public FriendList(Friend friend){this(friend.getIdTbFriend(), friend.getName(), friend.getEmail(), friend.getPhone());}
}
