package Practical;

public class Student {
    public int StudentID;
    public String name ;
    public String address ;
    public String phone ;

    public Student(){

    }
    public Student(int studentID, String name, String address, String phone) {
        StudentID = studentID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        System.out.println("2.add address");
        System.out.println("3.add phone");
        opt = s.nextInt();

        switch (opt){
            case 1:
                System.out.println("Nhap ten hoc sinh");
                name = s.nextLine();
                break;
            case 2:
                System.out.println("Nhap dia chi");
                address = s.nextLine();
                break;
            case 3:
                System.out.println("Nhap so dien thoai");
                phone = s.nextLine();
                break;
            case 4:
                break;
        }
    }
}
