package lab_session6;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class INews {
    abstract void disPlay(String title, String PublishDate,
                          String Author, String Content, float AverageRate);
    abstract void calculate(float AverageRate);
}