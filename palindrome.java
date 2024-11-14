
package asm8;
import java.util.Scanner;
public class palindrome {
    

public class KiemTraPalindrome {
    public static boolean kiemTraPalindrome(String chuoi) {
        return chuoi.equals(new StringBuilder(chuoi).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Chuoi la palindrome: " + kiemTraPalindrome(chuoi));
    }
}

}
