
import java.util.Scanner;


public class VD0601MainWorld {

    // Attributes
    public static Class_ConNguoi themMotNguoi(int i) {

        String HoTen;
        int  Tuoi;
        String  GioiTinh;
        int SoCon, k;
        String CCCD;
        String [] dsCCCDcuaCon;
        Class_ConNguoi cn;

        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao Thong Tin nguoi thu: " + i);
        System.out.print("\tHo Ten: ");
        HoTen = in.nextLine();
        System.out.print("\tTuoi: ");
        Tuoi = in.nextInt();
        in.nextLine();
        System.out.print("\tGioi tinh: ");
        GioiTinh = in.nextLine();
        System.out.print("\tCCCD: ");
        CCCD = in.nextLine();
        System.out.print("\tSo nguoi con: ");
        SoCon = in.nextInt();
        in.nextLine();

        if (SoCon > 0) {
            dsCCCDcuaCon = new String[SoCon];
        } else {
            dsCCCDcuaCon =  null;
        }
        
        for(k=0; k<SoCon; k++) {
            System.out.print("\tCCCD cua nguoi con " + k);
            dsCCCDcuaCon[k] = in.nextLine();
        }

        cn = new Class_ConNguoi(HoTen, GioiTinh, Tuoi, CCCD);
        cn.suaThongTinConCai(SoCon, dsCCCDcuaCon);

        return  cn;
    }
    // Methods / Actions

    public static void timNguoiLonTuoi(Class_ConNguoi  []  dsditim) {
        Class_ConNguoi  xMax;
        int i;

        xMax = dsditim[0];
        for(i=1; i<dsditim.length; i++) {
            if ( xMax.Tuoi < dsditim[i].Tuoi) {
                xMax = dsditim[i];
            }
        }

        System.out.print("\n\n Nguoi co TUOI lon nhat " + xMax.GioiThieu() );
    } 

    public static void timNuNhoTuoi(Class_ConNguoi  []  dsditim) {
        
    } 

    public static void timNguoiNhieuCon(Class_ConNguoi  []  dsditim) {
        
    } 
    
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

        ///// Tim nguoi lon tuoi 
        timNguoiLonTuoi(dsThanhVien);

    }
}