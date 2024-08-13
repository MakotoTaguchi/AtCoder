import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 配列の要素数
        int N = sc.nextInt();
        // 目標の和
        int S = sc.nextInt();
        // カードの配列
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 合計がSかどうかのフラグ
        boolean flag = true;
        // 組み合わせを保存する配列
        List<List<Integer>> combAll = new ArrayList<>();

        for (int n = 1; n <= A.length; n++) {
            combine(A, n, 0, new ArrayList<>(), combAll);
        }

        for (List<Integer> comb : combAll) {
            // System.out.println(comb);
            int sum = 0;
            for (int num : comb) {
                sum += num;
            }
            if (sum == S) {
                System.out.println("Yes");
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("No");
        }

        sc.close();
    }

    private static void combine(int[] A, int n, int start, List<Integer> current, List<List<Integer>> combAll) {
        if (current.size() == n) {
            combAll.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < A.length; i++) {
            current.add(A[i]);
            combine(A, n, i + 1, current, combAll);
            current.remove(current.size() - 1);
        }
    }
}
