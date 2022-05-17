import java.util.Scanner;

public class VD0201_SoTien {
	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

		int T, soTo, loai;
		
		System.out.print("Nhap 1 so Tien (chia het cho 10k): ");
        T = in.nextInt();

        // Xử lý ĐỔI TIỀN 
        loai = 500000;
        if (T > loai) {
            soTo = T / loai;
            T = T - soTo * loai;
            System.out.println("  + " + soTo + " to " + loai);
        }

        loai = 200000;
        if (T > loai) {
            soTo = T / loai;
            T = T - soTo * loai;
            System.out.println("  + " + soTo + " to " + loai);
        }
        

        loai = 100000;
        if (T > loai) {
            soTo = T / loai;
            T = T - soTo * loai;
            System.out.println("  + " + soTo + " to " + loai);
        }
		

        loai = 50000;
        if (T > loai) {
            soTo = T / loai;
            T = T - soTo * loai;
            System.out.println("  + " + soTo + " to " + loai);
        }

        loai = 10000;
        if (T > loai) {
            soTo = T / loai;
            T = T - soTo * loai;
            System.out.println("  + " + soTo + " to " + loai);
        }

        if (T > 0)
            System.out.println(" ... con du ... " + T);
	}
}