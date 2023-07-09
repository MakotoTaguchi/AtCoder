import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1,0のいずれか三桁の整数の入力
        int num = sc.nextInt();
        int count = 0;

        int num_1 = (num / 1) % 10;
        int num_2 = (num / 10) % 10;
        int num_3 = (num / 100) % 100;
        if (num_1 == 1) {
            count++;
        }
        if (num_2 == 1) {
            count++;
        }
        if (num_3 == 1) {
            count++;
        }

        System.out.println(count);
    }
}
