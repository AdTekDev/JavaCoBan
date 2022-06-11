
import java.util.Scanner;


public class VD0501MainWorld {
    // Attributes

    // Methods / Actions
    
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        Class_ConNguoi cn1 = new Class_ConNguoi("Tu", "Nam", 44);
        Class_ConNguoi cn2 = new Class_ConNguoi("Minh", "Nam", 18);
		
		System.out.print("\n\nCN1 GioiThieu la: " + cn1.GioiThieu() );
        System.out.print("\n\nCN2 GioiThieu la: " + cn2.GioiThieu() );


    }
}