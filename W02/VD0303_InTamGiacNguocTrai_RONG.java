import java.util.Scanner;

public class VD0303_InTamGiacNguocTrai_RONG {


	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

		int H, i, j;
        String str;
		
		System.out.print("Nhap chieu Cao (H) cua Tam Giac: ");
        H = in.nextInt();

        
        for(i=H;i>=1;i--) 
        {
            str = "";
            for(j=1;j<=i;j++) 
            {
                if (i == H || j == i || j==1)
                    str += "*";
                else
                    str += " ";
            }
            System.out.println(str);            
        } 
        
	}
}