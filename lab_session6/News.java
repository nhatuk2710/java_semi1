
package lab_session6;

import java.util.ArrayList;
import java.util.Scanner;

public class News extends INews {
        public int ID;
        public String Title;
        public String PublishDate;
        public String Author;
        public String Content;
        public float AverageRate;

    public News( int ID, String title, String publishDate, String author, String content,
        float averageRate, ArrayList<INews > rareList){
            this.ID = ID;
            Title = title;
            PublishDate = publishDate;
            Author = author;
            Content = content;
            AverageRate = averageRate;
            this.rareList = rareList;
        }

        public int getID () {
            return ID;
        }

        public void setID ( int ID){
            this.ID = ID;
        }

        public String getTitle () {
            return Title;
        }

        public void setTitle (String title){
            Title = title;
        }

        public String getPublishDate () {
            return PublishDate;
        }

        public void setPublishDate (String publishDate){
            PublishDate = publishDate;
        }

        public String getAuthor () {
            return Author;
        }

        public void setAuthor (String author){
            Author = author;
        }

        public String getContent () {
            return Content;
        }

        public void setContent (String content){
            Content = content;
        }

        public float getAverageRate () {
            return AverageRate;
        }

        public ArrayList<INews> rareList;

    public News() {
            rareList = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i <= 3; i++) {
                this.setID(i);
                setID(sc.nextInt());
            }

        }
        @Override
        void calculate ( float AverageRate){
            int sum = 0;
            sum += this.getID();
            AverageRate = (float) sum / 3;
        }
        @Override
        void disPlay (String title, String PublishDate, String Author, String Content,float AverageRate){
            Scanner sc = new Scanner(System.in);
            setTitle(sc.nextLine());
            setAuthor(sc.nextLine());
            setContent(sc.nextLine());
            setPublishDate(sc.nextLine());
            System.out.println("Display :" + getTitle() + "," + getAuthor() + "," + getContent() + "," + getPublishDate());
            System.out.println("Trung binh cong =" + AverageRate);
        }
}
