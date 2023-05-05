import java.util.Scanner;
public class TH_KTNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Nhập số năm: ");
        year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year + " Là năm nhuận");
                } else {
                    System.out.println(year + " Không phải là năm nhuận");
                }
            } else {
                System.out.println(year + " Là năm nhuận");
            }
        } else {
            System.out.println(year + " Không phải là năm nhuận");
        }
    }
}
