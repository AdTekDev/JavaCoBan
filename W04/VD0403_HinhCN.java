import java.util.Scanner;

public class VD0403_HinhCN {
    // Attributes
    public static boolean trangthai;
    static int Dai;
    static int Rong;

    // Methods / Actions
    public static double chobietDienTich() {
        if (Dai >= 0 && Rong >= 0) {
            trangthai = true;
            return (Dai * Rong);
        } else {
            trangthai = false;
            return 0;
        }        
    }

    public static double chobietChuVi() {
        if (Dai >= 0 && Rong >= 0) {
            trangthai = true;
            return 2*(Dai + Rong);
        } else {
            trangthai = false;
            return 0;
        } 
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
		
		System.out.print("Nhap chieu Dai (D) , Rong  (R) cua Tam Giac: ");
        Dai = in.nextInt();
        Rong = in.nextInt();

        System.out.print("HCN D=" + Dai 
            + " R=" + Rong 
            + " co Dien Tich=" + chobietDienTich()
            + " co Chu Vi=" + chobietChuVi() 
            + " trang thai co loi ? " + trangthai
            );
    }
}