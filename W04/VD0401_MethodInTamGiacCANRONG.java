import java.util.Scanner;

public class VD0401_MethodInTamGiacCANRONG {

   
   public  static void veTamGiacRong(int H) {
        int i, j;
        String str;

        for(i=1;i<=H;i++) 
        {
            str = "";
            for(j=1;j<=H-i;j++) 
            {
                str += " ";
            }
            for(j=1;j<=2*i-1;j++) 
            {
                if (j==1 || j==2*i-1 || i==H)
                    str += "*";
                else
                    str += " ";
            }
            System.out.println(str);            
        } 
   }


	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

		int H;
		
		System.out.print("Nhap chieu Cao (H) cua Tam Giac: ");
        H = in.nextInt();

        
        veTamGiacRong(H);
        
	}
}