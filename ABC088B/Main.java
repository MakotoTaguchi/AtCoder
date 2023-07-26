import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // カード枚数の入力
        int N = sc.nextInt();
        // カード配列
        List<Integer> cardList = new ArrayList<Integer>();
        // カードを配列に代入する
        for (int i = 0; i <= N - 1; i++) {
            cardList.add(sc.nextInt());
        }

        // 点数の合計格納
        int Alice = 0;
        int Bob = 0;
        // 最初がAlice
        boolean order = true;

        while (cardList.size() > 0) {
            if (order == false) {
                Bob += Collections.max(cardList);
                cardList.remove(Collections.max(cardList));
                order = true;
            } else {
                Alice += Collections.max(cardList);
                cardList.remove(Collections.max(cardList));
                order = false;
            }
        }

        System.out.println(Alice - Bob);
    }
}
