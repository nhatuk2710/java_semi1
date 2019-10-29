package assignment7;

import java.util.ArrayList;

public class ListCustomer {
    public ArrayList<CustomerVN> listCusVN;
    public ArrayList<CustomerIN> listCusIN;

    public ListCustomer() {
        listCusVN  = new ArrayList<CustomerVN>();
        listCusIN  = new ArrayList<CustomerIN>();
    }

    public void addCusVN() {
        System.out.println("Them khach hang Viet Nam vao danh sach");
        CustomerVN newCustomer = new CustomerVN();
        listCusVN.add(newCustomer);
    }

    public void addCusIN(){
        System.out.println("Them khach hang nuoc ngoai vao danh sach");
        CustomerIN newCustomer = new CustomerIN();
        listCusIN.add(newCustomer);
    }

    public void showlistCustomer(){
        System.out.println("Danh sach cac khach hang Viet Nam");
        for(CustomerVN c:listCusVN){
            c.showCustomer();
        }
        System.out.println("Danh sach cac khach hang nuoc ngoai");
        for (CustomerIN c:listCusIN){
            c.showCustomer();
        }
    }

    public void countCus(){
        System.out.println("Hien tai co "+(listCusVN.size()+listCusIN.size())+" khach hang: "
                +listCusVN.size()+" khach hang VN, "+listCusVN.size()+" khach hang nuoc ngoai");
    }

    public void tienTBnuocngoai(){
        int temp = 0;
        for(CustomerIN c:listCusIN){
            temp += c.tongtien;
        }
        System.out.println("Trung binh tien dien nguoi nuoc ngoai: "+temp/listCusIN.size());
    }

}