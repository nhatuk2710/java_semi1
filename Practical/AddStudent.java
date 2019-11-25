package Practical;

import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent {
    public static void main(String[] args){
        ArrayList<Student> listStudent = new ArrayList<>();
        int dem = 0;

        System.out.println("Nhap 'add' de the thong tin hoc sinh");

        String opt = "";
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Lua chon: ");
            opt = s.nextLine();

            switch (opt.toLowerCase()){
                case "add":
                    dem++;
                    int id=dem;
                    System.out.println("Nhap ten hoc sinh");
                    String name = s.nextLine();
                    System.out.println("Nhap dia chi");
                    String address = s.nextLine();
                    System.out.println("Nhap chu so dien thoai");
                    String phone = s.nextLine();

            }
        }while (true);
    }
}