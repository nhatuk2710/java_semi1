package lab_session6;

public class Main {
    public static void main(String args[]){
        News n1 = new News();
        n1.getID();
        System.out.println("Display : "+n1.getTitle()+","+n1.getAuthor()+","
                +n1.getContent()+","+n1.getPublishDate());
        System.out.println("Trung binh cong = "+n1.AverageRate);
  }
}
