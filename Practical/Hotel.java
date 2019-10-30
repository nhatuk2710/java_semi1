package Practical;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    public String name;
    public String location;
    public String ownerName;

    public void Hotel(){

    }

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void hienThi(){
        System.out.println("Ten Hotel"+name);
        System.out.println("Dia chi"+location);
        System.out.println("Chu so huu"+ownerName);
    }

    public void addHotel(){
        int opt;
        Scanner s = new Scanner(System.in);
        System.out.println("1.add name");
        System.out.println("2.add location");
        System.out.println("3.add ownerName");
        opt = s.nextInt();

        switch (opt){
            case 1:
                System.out.println("Nhap ten hotel");
                name = s.nextLine();
                break;
            case 2:
                System.out.println("Nhap dia chi");
                location = s.nextLine();
                break;
            case 3:
                System.out.println("Nhap ten chu so huu");
                ownerName = s.nextLine();
                break;
            case 4:
                break;
        }
    }


}