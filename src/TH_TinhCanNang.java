import java.util.Scanner;
public class TH_TinhCanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập số cân nặng: ");
        weight = sc.nextDouble();

        System.out.println("Nhập chiều cao");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.println("Chỉ số BMI là: ");

        if (bmi < 18)
            System.out.println(bmi + " Bạn rất gầy ");
        else if (bmi < 25.0)
            System.out.println(bmi + " Bạn bình thường");
        else if (bmi < 30.0)
            System.out.println(bmi + " Bạn rất béo ");
        else
            System.out.println(bmi + " Bạn bị báo phì");
    }
}
