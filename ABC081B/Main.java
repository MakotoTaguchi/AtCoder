import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 個数の入力
        int quantity = sc.nextInt();

        // 入力した数字を配列に代入
        int[] num;
        num = new int[quantity];

        // 回数
        int count = 0;

        for (int i = 0; i <= quantity - 1; i++) {
            num[i] = sc.nextInt();
        }

        boolean flag = true;

        while (flag) {
            for (int i = 0; i <= quantity - 1; i++) {
                if (num[i] % 2 != 0) {
                    flag = false;
                    break;
                } else {
                    num[i] = num[i] / 2;
                }

                if (i == quantity - 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
