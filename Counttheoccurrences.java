package asm8;

import java.util.Scanner;

public class Counttheoccurrences {

    public class DemKyTu {

        public static int demKyTu(String chuoi, char kyTu) {
            int dem = 0;
            for (char c : chuoi.toCharArray()) {
                if (c == kyTu) {
                    dem++;
                }
            }
            return dem;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap chuoi: ");
            String chuoi = scanner.nextLine();
            System.out.print("Nhap ky tu can dem: ");
            char kyTu = scanner.next().charAt(0);
            System.out.println("So lan xuat hien cua ky tu '" + kyTu + "' la: " + demKyTu(chuoi, kyTu));
        }
    }

}
