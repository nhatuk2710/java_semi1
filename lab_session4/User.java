package lab_session4;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    public String ten;
    public int tuoi;
    public String cmnd;

    public User() {
        this.inputUser();
    }
    public User(String ten, int tuoi, String cmnd) {

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void inputUser() {
        System.out.println("nhap thong tin user");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten User");
        setTen(sc.nextLine());
        System.out.println("nhap tuoi User");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap cmnd");
        setCmnd(sc.nextLine());
    }
    public void showUser() {
        System.out.println("ten User:"+getTen());
        System.out.println("tuoi:"+getTuoi());
        System.out.println("cmnd:"+getCmnd());
    }
}