package Practical;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Practical.Hotel> listHotel = new ArrayList<>();
        int dem = 0;

        System.out.println("Nhap 'add' de the thong tin hotel");
        System.out.println("Nhap 'search' de tim thong tin hotel");

        String opt = "";
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Lua chon: ");
            opt = s.nextLine();

            switch (opt.toLowerCase()){
                case "add":
                    dem++;
                    int id=dem;
                    System.out.println("Nhap ten hotel");
                    String name = s.nextLine();
                    System.out.println("Nhap dia chi");
                    String location = s.nextLine();
                    System.out.println("Nhap chu so huu");
                    String ownerName = s.nextLine();
                    System.out.println("Day la nha nghi cua :" +ownerName);
                    System.out.println("Dia chi :" +location);
                    System.out.println("ten :" +name);
                    String add = s.nextLine();
                case "search":

            }
        }while (true);
    }
}