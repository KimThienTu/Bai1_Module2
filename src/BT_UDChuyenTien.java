import java.util.Scanner;

public class BT_UDChuyenTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập USD");
        double a = sc.nextDouble();

        System.out.println("Nhập VND");
        double b = sc.nextDouble();

        double USD = a * 23000;
        System.out.println(a + " USD = " + USD + " VND");

        double VND = b / 23000;
        System.out.println(b + " VND = " + VND + " USD");
    }
}
