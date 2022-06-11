
import java.util.Scanner;


public class VD0502MainWorld {
    // Attributes
    public static Class_ConNguoi themMotNguoi(int i) {

        String HoTen;
        int  Tuoi;
        String  GioiTinh;

        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao Thong Tin nguoi thu: " + i);
        System.out.print("\tHo Ten: ");
        HoTen = in.nextLine();
        System.out.print("\tTuoi: ");
        Tuoi = in.nextInt();
        in.nextLine();
        System.out.print("\tGioi tinh: ");
        GioiTinh = in.nextLine();
        
        return new Class_ConNguoi(HoTen, GioiTinh, Tuoi);
    }
    // Methods / Actions
    
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        int songuoi,i;
        Class_ConNguoi  [] dsThanhVien;


        System.out.print("Nhap so Nguoi trong gia dinh: ");
        songuoi = in.nextInt();

        if (songuoi <= 0) 
        {

        }
        dsThanhVien = new Class_ConNguoi  [songuoi];
        for(i=0; i<songuoi; i++) {
            dsThanhVien[i] = themMotNguoi(i);
        }

        /// Gia dinh gioi thieu tung nguoi 1

        for(i=0; i<songuoi; i++) {
            System.out.print("\n\n Thanh vien thu " + i 
            + dsThanhVien[i].GioiThieu() );
        }

    }
}