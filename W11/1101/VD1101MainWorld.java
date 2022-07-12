
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.lang.Math;


public class VD1101MainWorld {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n, i, sl;
        int [] dsSO;


        System.out.println(".\n.\n. **** Cho biet can nhap Danh Sach co Bao Nhieu so (n) *** "); 
        n = in.nextInt();

        if (n > 0) {
            // Khoi tao Noi CHUA Data 
            dsSO = new int[n];

            // Nhap DATA vao
            for(i=0; i<n; i++) {
                System.out.print("\n Nhap so thu  " + i + " : ");
                dsSO[i] = in.nextInt();
            }

            // XU LY data da NHAP 
            // a. Cac so CHAN 
            sl = 0;
            for(i=0; i<n; i++) {
                if ( dsSO[i] % 2 == 0 ) {
                    sl++;
                    System.out.println("\n So chan thu  " + sl + " tai vi tri " + i + " = " + dsSO[i]);
                }

            }
        }

        
    }

}