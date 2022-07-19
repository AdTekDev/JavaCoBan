
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.lang.Math;


public class VD1101MainWorld {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n, i, sl, SONHONHAT, vtri, SOLONNHAT;
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

            // b. Cac so LE 
            sl = 0;
            for(i=0; i<n; i++) {
                if ( dsSO[i] % 2 != 0 ) {
                    sl++;
                    System.out.println("\n So LE thu  " + sl + " tai vi tri " + i + " = " + dsSO[i]);
                }
            }

            // c. SONHONHAT 
            SONHONHAT = dsSO[0];
            vtri = 0;
            for(i=0; i<n; i++) {
                if ( SONHONHAT > dsSO[i]  ) {
                    SONHONHAT = dsSO[i];
                    vtri = i;
                }
            }
            System.out.println("\n So  SONHONHAT - tai vi tri " + vtri + " = " + SONHONHAT);

            // d. SOLONNHAT 
            SOLONNHAT = dsSO[0];
            vtri = 0;
            for(i=0; i<n; i++) {
                if ( SOLONNHAT < dsSO[i]  ) {
                    SOLONNHAT = dsSO[i];
                    vtri = i;
                }
            }
            System.out.println("\n So  SOLONNHAT - tai vi tri " + vtri + " = " + SOLONNHAT);


            // e. SO LAP LAI NHIEU NHAT 
            int giatriNN = dsSO[0];
            int soluongNN = 1;
            int dem = 0, j;

            vtri = 0;
            for(i=0; i<n; i++) {

                dem = 1;
                for(j=i+1; j<n; j++) {
                    if (dsSO[j] == dsSO[i]) {
                        dem++;
                    }
                }

                if (dem > soluongNN) {
                    giatriNN = dsSO[i];
                    soluongNN = dem;
                    vtri = i;
                }

            }
            System.out.println("\n So  LAP LAI NHIEU NHAT - tai vi tri " 
                + vtri + " = " + giatriNN + " lap lai " + soluongNN);


        }

        
    }

}