// import java.util.Date;

import java.awt.*;

public class hello {
    public static void main(String[] args) {
        Point point = new Point(1, 1);
        Point point2 = point;
        point.x = 2;
        System.out.println(point2);
    }
}