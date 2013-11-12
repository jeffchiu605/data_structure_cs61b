package day3;

import java.awt.*;

public class Test1 {

    public static void main (String [ ] args) {
        Point p1 = new Point ( );
        p1.x = 1;
        p1.y = 2;
        Point p2 = new Point ( );
        p2.x = 3;
        p2.y = 4;
        // now the fun begins
        p2.x = p1.y;
        p1 = p2;
        p2.x = p1.y;
        System.out.println (p1.x + " " + p1.y 
            + " " + p2.x + " " + p2.y);
    }
}
