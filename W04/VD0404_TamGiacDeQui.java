import java.util.Scanner;

public class VD0404_TamGiacDeQui {
    // Attributes
    public static boolean trangthai;
    static int H;

    // Methods / Actions
    public static String inTamGiac(int Hn) {
        String str;
        if (Hn <= 0) {
            return "";
        }
        str = inTamGiac(Hn-1) + "*";
        System.out.println(str);
        return str;
    }


    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
		
		System.out.print("Nhap chieu Cao  (H) cua Tam Giac: ");
        H = in.nextInt();

        inTamGiac(H);

    }
}