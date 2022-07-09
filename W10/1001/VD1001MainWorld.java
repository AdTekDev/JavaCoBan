
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.lang.Math;


public class VD1001MainWorld {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n, sl, socantim, i;
        int [] dsSoNguyenTo;

        System.out.println(".\n.\n. **** TIM N SO NGUYEN TO *** "); 
        n = in.nextInt();
        System.out.println(".\n. n= " + n);


        if (n > 0) {
            dsSoNguyenTo = new int[n];
            dsSoNguyenTo[0] = 2;
            socantim = 3;
            sl = 1;
            while (sl < n) {
                i = 0;
                while ( (i < sl) && (socantim % dsSoNguyenTo[i] != 0) ) {
                    i++;                    
                }
                System.out.println("\n ........" + socantim);
                if (i>=sl) {
                    dsSoNguyenTo[sl++] = socantim;
                    System.out.println(".\n. " + sl + " " + socantim);
                }
                socantim++;
            }

        } else {
            System.out.println(".\n ban ko tim SNT nao !!! ");
        }
        

        
    }

}