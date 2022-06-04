import java.util.Scanner;

public class VD0402_HinhCN {
    // Attributes
    public static boolean trangthai;

    // Methods / Actions
    public static double xacdinhDienTich(int Dai, int Rong) {
        if (Dai >= 0 && Rong >= 0) {
            trangthai = true;
            return (Dai * Rong);
        } else {
            trangthai = false;
            return 0;
        }        
    }

    public static double xacdinhChuVi(int Dai, int Rong) {
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

		int D, R;
		
		System.out.print("Nhap chieu Dai (D) , Rong  (R) cua Tam Giac: ");
        D = in.nextInt();
        R = in.nextInt();

        System.out.print("HCN D=" + D 
            + " R=" + R 
            + " co Dien Tich=" + xacdinhDienTich(D, R)
            + " co Chu Vi=" + xacdinhChuVi(D, R) 
            + " trang thai co loi ? " + trangthai
            );
    }
}