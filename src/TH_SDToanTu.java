import java.util.Scanner;
public class TH_SDToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập width: ");
        width = sc.nextFloat();

        System.out.println("Nhập height: ");
        height = sc.nextFloat();
        float area = width * height;

        System.out.println("Diện tích là: " + area);
    }
}
