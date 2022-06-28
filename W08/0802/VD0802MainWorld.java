
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class VD0802MainWorld {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int soCuaPC = 60;
        int soNguoiDoan=-1;
        int soLan = 0;

        System.out.println("\n\n **** TRO CHOI DOAN SO (1..99) trong 5 lan *** ");
        while (soLan < 5 && soNguoiDoan != soCuaPC) {
            soLan++;
            System.out.println("\n\n Nhap lan thu " + soLan);
            soNguoiDoan = in.nextInt();

            if (soNguoiDoan > soCuaPC) {
                System.out.println("\n\t ---> So NHAP VAO LON HON !!! ");
            } else if (soNguoiDoan < soCuaPC) {
                System.out.println("\n\t ---> So NHAP VAO nho HON !!! ");
            } else {
                System.out.println("\n\t /// Ban Da Doan DUNG so " + soCuaPC);
            }
        }
        
    }

}