import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請給我第一個數字:");
        int x = scanner.nextInt();
        System.out.println("請給我第二個數字:");
        int y = scanner.nextInt();

        int 加法答案 = Calculator.加法(x,y);
        int 減法答案 = Calculator.減法(x,y);

        System.out.printf("%d+%d=%d",x,y,加法答案);
        System.out.printf("%d+%d=%d",x,y,減法答案);
    }
}
