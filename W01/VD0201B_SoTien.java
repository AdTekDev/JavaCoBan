import java.util.Scanner;

public class VD0201B_SoTien {

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

		int T, soTo, loai;
		
		System.out.print("Nhap 1 so Tien (chia het cho 10k): ");
        T = in.nextInt();

        // Xử lý ĐỔI TIỀN 
        loai = 500000;
        T = TinhSoToTien(T, loai);

        loai = 200000;
        T = TinhSoToTien(T, loai);
        
        loai = 100000;
        T = TinhSoToTien(T, loai);
		
        loai = 50000;
        T = TinhSoToTien(T, loai);

        loai = 10000;
        T = TinhSoToTien(T, loai);

        if (T > 0)
            System.out.println(" ... con du ... " + T);
	}
}