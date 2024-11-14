
package asm8;
    import java.util.Scanner;
import java.util.Arrays;
public class Splitwords {
public class TachTu {
    public static String[] tachTu(String chuoi) {
        return chuoi.trim().split("\\s+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Cac tu trong chuoi la: " + Arrays.toString(tachTu(chuoi)));
    }
}

}
