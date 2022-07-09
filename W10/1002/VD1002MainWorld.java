
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.lang.Math;


public class VD1002MainWorld {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        long x, i, y;


        System.out.println(".\n.\n. **** TIM SO chinh phuong - co trong 1...1000 *** "); 

        for (x = 1; x <= 1000; x++) {
            y = Math.round( Math.sqrt(x) );
            if ( x == y * y ) {
                System.out.println( ".\n " + x );
            }
        }
        

        
    }

}