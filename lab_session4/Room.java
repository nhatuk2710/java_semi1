package lab_session4;

import java.util.ArrayList;
import java.util.Scanner;
import lab_session4.User;
public class Room {
    public String tenPhong;
    public String viTri;
    public ArrayList<User> dsUser;

    public Room() {
        this.dsUser = new ArrayList<>();
    }
    public Room(String tenPhong, String viTri) {

    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void addUser(User user) {
        dsUser.add(user);
    }
    public void removeUser(User user) {
        dsUser.remove(user);
    }
    public void inputInfor() {
        System.out.println("nhap thong tin phong");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten phong");
        setTenPhong(sc.nextLine());
        System.out.println("nhap vi tri");
        setViTri(sc.nextLine());
    }
    public void showInfor() {
        System.out.println(getTenPhong());
        System.out.println(getViTri());
        for (User u: this.dsUser) {
            u.showUser();
        }
    }
}
