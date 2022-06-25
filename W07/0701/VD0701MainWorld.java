
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class VD0701MainWorld {

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
        Class_ConNguoi  xMin;
        int i;
        xMin = null;
        for(i=0; i<dsditim.length; i++) {
            if ( dsditim[i].GioiTinh.equals("Nu") ) {
                if ( xMin == null || xMin.Tuoi > dsditim[i].Tuoi) {
                    xMin = dsditim[i];
                }
            }
        }
        if (xMin != null)
        System.out.print("\n\n NU co TUOI NHO nhat " + xMin.GioiThieu() );
        else
        System.out.print("\n\n DS khong co Nu !!!");
    } 

    public static void timNguoiNhieuCon(Class_ConNguoi  []  dsditim) {
        
    } 

    public static void timNamNhieuCon(Class_ConNguoi  []  dsditim) {
        ArrayList<Class_ConNguoi>  xResults;
        Class_ConNguoi  x;
        ArrayList<String>  xNames;
        int i;
        xResults = new ArrayList<Class_ConNguoi>();
        xNames = new ArrayList<String>();
        for(i=0; i<dsditim.length; i++) {
            if ( dsditim[i].GioiTinh.equals("Nam") ) {
                if ( dsditim[i].SoCon > 1) {
                    xNames.add(dsditim[i].HoTen);
                    x = (Class_ConNguoi) dsditim[i];
                    xResults.add(x);
                    x.GioiThieu();
                }
            }
        }
        if (xResults.size() > 0)
        {
            System.out.print("\n\n Co " + xResults.size() + " NAM co nhieu hon 1 con !!! " );
            i = 0;
            for (Class_ConNguoi p : xResults) {
                System.out.println(p);
                System.out.println(xResults.get(i));
                x = (Class_ConNguoi) xResults.get(i);
                x.GioiThieu();
                i++;
            }

            for(String xn : xNames) {
                System.out.println(xn);
            }
            System.out.print("\n ...... \t ...... ");

            Iterator<Class_ConNguoi> it = xResults.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
            }
        }
        else
            System.out.print("\n\n Khong co NAM nhieu hon 1 con !!!");
    } 
    
    
    public static void timHoTenNamNhieuCon(Class_ConNguoi  []  dsditim) {
        ArrayList<String>  xNames;
        int i;

        xNames = new ArrayList<String>();
        for(i=0; i<dsditim.length; i++) {
            if ( dsditim[i].GioiTinh.equals("Nam") ) {
                if ( dsditim[i].SoCon > 1) {
                    xNames.add(dsditim[i].HoTen);
                }
            }
        }
        if (xNames.size() > 0)
        {
            System.out.print("\n\n Co " + xNames.size() + " NAM co nhieu hon 1 con !!! " );
            
            i = 1;
            for(String xn : xNames) {
                System.out.println("\n\t " + i  + "\t" + xn);
                i++;
            }

        }
        else
            System.out.print("\n\n Khong co NAM nhieu hon 1 con !!!");
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

        timNuNhoTuoi(dsThanhVien);

        timHoTenNamNhieuCon(dsThanhVien);

    }
}