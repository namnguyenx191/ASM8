
package asm8;
import java.util.Scanner;
public class Reverse {
    

public class DaoNguocChuoi {
    public static String daoNguocChuoi(String chuoi) {
        return new StringBuilder(chuoi).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Chuoi dao nguoc la: " + daoNguocChuoi(chuoi));
    }
}

}
