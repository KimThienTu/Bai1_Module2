import java.util.Scanner;
public class BT_UDDocSoThanhChu {
    // Khai báo mảng từ số 0 đến số 19.
    public static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    // Khai báo mảng từ số 20 đến 90.
    public static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    // Hàm xử lý tách phần nguyên và phần dư của 2 mảng.
    public static final String ConverNumberToText(int number) {
        if (number < 0) {
            return "Bạn đã nhập sai";
        }
        if (number < 20) {
            return units[number];
        }
        if (number < 100) {
            return tens[number / 10] + " " + units[number % 10];
        }
        if (number < 1000) {
            return tens[number / 100] + " Hunred " + ConverNumberToText(number % 100);
        }
        return "Số lớn quá không muốn đọc";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số");
        int num = sc.nextInt();
        System.out.println(ConverNumberToText(num));
        sc.close();
    }
}
