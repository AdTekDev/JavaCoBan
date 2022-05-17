import java.util.Scanner;

public class VD0201C_SoTien {

    public static int TinhSoToTien(int T , int loaiTien) {
        int soTo;
        if (T >= loaiTien) {
            soTo = T / loaiTien;
            T = T - soTo * loaiTien;
            System.out.println("  + " + soTo + " to " + loaiTien);
        }
        return T;
    }
	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

		int T, i;
		
		System.out.print("Nhap 1 so Tien (chia het cho 10k): ");
        T = in.nextInt();

        // Xử lý ĐỔI TIỀN 
        int []  dsLoaiTien = { 500000, 200000, 100000, 50000, 10000 };

        for(i = 0; i<5; i++) {
            //System.out.println("Loai thu " + i + " =  " + dsLoaiTien[i]);
            T = TinhSoToTien(T, dsLoaiTien[i] );
        }
        

        if (T > 0)
            System.out.println(" ... con du ... " + T);
	}
}