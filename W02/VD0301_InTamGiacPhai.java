import java.util.Scanner;

public class VD0301_InTamGiacPhai {


	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

		int H, i, j;
        String str;
		
		System.out.print("Nhap chieu Cao (H) cua Tam Giac: ");
        H = in.nextInt();

        
        for(i=1;i<=H;i++) 
        {
            str = "";
            for(j=1;j<=H-i;j++) 
            {
                str += " ";
            }
            for(j=1;j<=i;j++) 
            {
                str += "*";
            }
            System.out.println(str);            
        } 
        
	}
}