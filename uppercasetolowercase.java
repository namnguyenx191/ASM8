
package asm8;
  import java.util.Scanner;
public class uppercasetolowercase {
    

public class DoiChuHoaThuong {
    public static String doiChuHoaThuong(String chuoi) {
        StringBuilder ketQua = new StringBuilder();
        for (char c : chuoi.toCharArray()) {
            if (Character.isUpperCase(c)) ketQua.append(Character.toLowerCase(c));
            else ketQua.append(Character.toUpperCase(c));
        }
        return ketQua.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Chuoi sau khi doi chu hoa thuong: " + doiChuHoaThuong(chuoi));
    }
}

}
