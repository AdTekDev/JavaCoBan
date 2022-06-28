
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class VD0801MainWorld {

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
            System.out.print("\tCCCD cua nguoi con " + k + " : ");
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
        int i;
        xResults = new ArrayList<Class_ConNguoi>();
        for(i=0; i<dsditim.length; i++) {
            if ( dsditim[i].GioiTinh.equals("Nam") ) {
                if ( dsditim[i].SoCon > 1) {
                    xResults.add(dsditim[i]);
                }
            }
        }
        if (xResults.size() > 0)
        {
            System.out.print("\n\n Co " + xResults.size() + " NAM co nhieu hon 1 con !!! " );
            i=0;
            for (Class_ConNguoi p : xResults) {
                System.out.println("\n\t" + (i++) + "\t"
                + p.GioiThieu() );
            }

            System.out.print("\n\n ------- Iterator ");
            Iterator<Class_ConNguoi> it = xResults.iterator();
            while(it.hasNext()) {
                System.out.println( it.next().GioiThieu() );
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
    
    public static void timNguoiVoiCCCD(Class_ConNguoi  []  dsditim, String cccd) {
        Class_ConNguoi  xP;
        int i;

        xP = null;
        i = 0; 
        while(i < dsditim.length && xP == null) {
            if (dsditim[i].CCCD.equals(cccd)) {
                xP = dsditim[i];
            }
            i++;
        }

        if (xP == null)
            System.out.println("\n Khong co Nguoi co CCCD= " + cccd);
        else 
            System.out.println("\n " + xP.GioiThieu());
    } 

    public static void timNguoivaConVoiCCCD(Class_ConNguoi  []  dsditim, String cccd) {
        Class_ConNguoi  xP;
        int i;

        xP = null;
        i = 0; 
        while(i < dsditim.length && xP == null) {
            if (dsditim[i].CCCD.equals(cccd)) {
                xP = dsditim[i];
            }
            i++;
        }

        if (xP == null)
            System.out.println("\n Khong co Nguoi co CCCD= " + cccd);
        else 
        {
            System.out.println("\n Nguoi co CCCD tim thay: " + xP.GioiThieu());
            System.out.println("\n------" + xP.SoCon + " con: ");
            for(i=0;i<xP.SoCon;i++) {
                timNguoiVoiCCCD(dsditim, xP.dsCCCDcuaCon[i]);
            }
        }
    } 

    public static String multipleStr(String str, int n) {
        String x = "";
        int i;
        for(i=0;i<n;i++) {
            x += str;
        }
        return x;
    }


    public static void timConChauVoiNguoiCoCCCD (
        Class_ConNguoi  []  dsditim, 
        String cccd, int doithu         ) {

        Class_ConNguoi  xP;
        int i;

        xP = null;
        i = 0; 
        while(i < dsditim.length && xP == null) {
            if (dsditim[i].CCCD.equals(cccd)) {
                xP = dsditim[i];
            }
            i++;
        }

        if (xP == null)
            System.out.println("\n Doi thu " + doithu + " Khong co Nguoi co CCCD= " + cccd);
        else 
        {
            System.out.println("\n Doi thu " + doithu + " Nguoi co CCCD tim thay: " + xP.GioiThieu());
            System.out.println("\n" + multipleStr("\t", doithu ) + "------" + xP.SoCon + " con: ");
            for(i=0;i<xP.SoCon;i++) {
                timConChauVoiNguoiCoCCCD(dsditim, xP.dsCCCDcuaCon[i], doithu+1);
            }
        }
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
        System.out.print("\n\n\n\n\n\n **************** Tim nguoi lon tuoi ::: ");
        timNguoiLonTuoi(dsThanhVien);

        System.out.print("\n\n\n\n\n\n **************** Tim NU nho tuoi ::: ");
        timNuNhoTuoi(dsThanhVien);

        System.out.print("\n\n\n\n\n\n **************** Tim nguoi Ho Ten NAM Nhieu CON ! ::: ");
        timHoTenNamNhieuCon(dsThanhVien);

        System.out.print("\n\n\n\n\n\n **************** Tim NAM NHIEU CON ::: ");
        timNamNhieuCon(dsThanhVien);

        System.out.print("\n\n\n\n\n\n **************** Tim Nguoi co CCCD ::: ");
        timNguoiVoiCCCD(dsThanhVien, "1");

        System.out.print("\n\n\n\n\n\n **************** Tim CON voi Nguoi co CCCD ::: ");
        timNguoivaConVoiCCCD(dsThanhVien, "1");

        System.out.print("\n\n\n\n\n\n **************** Tim CON CHAU *** voi Nguoi co CCCD ::: ");
        timConChauVoiNguoiCoCCCD(dsThanhVien, "1", 0);
    }
}