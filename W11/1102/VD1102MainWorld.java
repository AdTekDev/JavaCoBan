
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.lang.Math;


public class VD1102MainWorld {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n, i;
        String str;
        char kytu;


        System.out.println(".\n.\n. **** Nhap chuoi ky tu: *** "); 
        str = in.nextLine();

        System.out.println(".\n Ban da nhap ... [" + str + "] ");

        for(i=0;i<str.length();i++){
            kytu = str.charAt(i);
            if ( ('A' <= kytu) && (kytu <= 'Z') ) {
                System.out.println(" --  chu hoa: " + i + " " +  kytu );
            }
            


        }
    }

}