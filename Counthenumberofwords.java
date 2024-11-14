
package asm8;
 import java.util.Scanner;
public class Counthenumberofwords {
   

public class DemSoTu {
    public static int demSoTu(String chuoi) {
        return chuoi.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        System.out.println("So tu trong chuoi la: " + demSoTu(chuoi));
    }
}

}
