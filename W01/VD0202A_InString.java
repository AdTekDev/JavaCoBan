import java.util.Scanner;

public class VD0202A_InString {


	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

		int H, i;
        String str;
		
		System.out.print("Nhap chieu Cao (H) cua Tam Giac: ");
        H = in.nextInt();

        str = "";
        i = 0;
        do {
            i++;
            str += "*";
            System.out.println(str);            
        } while (i<H);
        
	}
}