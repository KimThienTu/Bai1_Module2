import java.util.Scanner;

public class TH_GPTBac1 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 1");
        System.out.println("PT có dạng: 'a * x + b = c'");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a");
        double a = sc.nextDouble();

        System.out.println("Nhập giá trị b");
        double b = sc.nextDouble();

        System.out.println("Nhập giá trị của c");
        double c = sc.nextDouble();

        if (a != 0){
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c){
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
