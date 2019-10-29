package lab_session7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int identity = 1;
    public static void main(String args[]){
        ArrayList<Student> studentList = new ArrayList<>();
        boolean p = true;
        Scanner sc = new Scanner(System.in);
        while (p){
            System.out.println("1. Add student");
            System.out.println("2. Edit student by Id");
            System.out.println("3. Delete student by Id");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show students");
            System.out.println("0. Exit");
            int opt = sc.hasNextInt()?sc.nextInt():7;
            switch (opt){
                case 1:studentList.add(Main.addStudent());break;
                case 2: editStudent(studentList);break;
                case 3: deleteStudent(studentList);break;
                case 4:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if(o1.getGpa() < o2.getGpa()){
                                return -1;
                            }
                            return 0;
                        }
                    });break;
                case 5:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });break;
                case 6:
                    for (Student s:studentList){
                        System.out.println(s.getId()+ "--"+s.getName()+ "--"+s.getGpa());
                    }
                    break;
                case 0: p=false;break;
            }
        }
    }

    public static Student addStudent(){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap ID");
//        int id = sc.hasNextInt()?sc.nextInt():0;
//        sc.nextLine();
        int id = identity++;
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi:");
        String address = sc.nextLine();
        System.out.println("Nhap GPA:");
        double gpa = sc.nextDouble();
        return new Student(id,name,age,address,gpa);
    }

    public static void editStudent(ArrayList<Student> studentList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID muon sua:");
        int id = sc.hasNextInt()?sc.nextInt():0;
        sc.nextLine();
        for (Student s: studentList){
            if(s.getId() == id){
                System.out.println("Nhap ten:");
                s.setName(sc.nextLine());

                System.out.println("Nhap tuoi");
                s.setAge(sc.nextInt());
                sc.nextLine();

                System.out.println("Nhap dia chi:");
                s.setAddress( sc.nextLine());

                System.out.println("Nhap GPA:");
                s.setGpa(sc.nextDouble());
                return;
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> studentList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID muon xoa:");
        int id = sc.hasNextInt()?sc.nextInt():0;
        sc.nextLine();
        for (Student s: studentList){
            if(s.getId() == id){
                studentList.remove(s);
                return;
            }
        }
    }
}