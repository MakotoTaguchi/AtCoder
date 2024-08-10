import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 長さの入力
        int N = sc.nextInt();

        if (N % 2 != 0) {
            sc.close();
            return;
        }
        int circle = N / 2;

        sc.close();
    }
}
