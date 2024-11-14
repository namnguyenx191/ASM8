
package asm8;
import java.util.Scanner;
public class Removeextraspaces {

public class XoaKhoangTrangThua {
    public static String xoaKhoangTrangThua(String chuoi) {
        return chuoi.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Chuoi sau khi xoa khoang trang thua: " + xoaKhoangTrangThua(chuoi));
    }
}

}
