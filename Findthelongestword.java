
package asm8;
  import java.util.Scanner;
public class Findthelongestword {

public class TimTuDaiNhat {
    public static String timTuDaiNhat(String chuoi) {
        String[] tu = chuoi.trim().split("\\s+");
        String tuDaiNhat = "";
        for (String t : tu) {
            if (t.length() > tuDaiNhat.length()) tuDaiNhat = t;
        }
        return tuDaiNhat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Tu dai nhat trong chuoi la: " + timTuDaiNhat(chuoi));
    }
}

}
