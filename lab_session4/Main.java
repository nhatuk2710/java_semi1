package lab_session4;

public class Main {
    public static void main(String[] args) {
        Room room = new Room();
        room.addUser(new User());
        room.addUser(new User());
//        room.removeUser(user);
        room.inputInfor();
        room.showInfor();
    }
}
