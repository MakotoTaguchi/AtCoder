import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        String S = sc.next();
        // 文字列T
        String T = "";
        // 文字列の長さ
        int len = S.length();

        if (S.charAt(0) != 'd' && S.charAt(0) != 'e') {
            System.out.println("No");
            return;
        }

        while (len >= 0) {
            if (len == 0) {
                System.out.println("YES");
                return;
            }
            if (len >= 11 && S.substring(len - 11, len).equals("dreameraser")) {
                len -= 11;
            } else if (len >= 10 && S.substring(len - 10, len).equals("dreamerase")) {
                len -= 10;
            } else if (len >= 5 && S.substring(len - 5, len).equals("dream")) {
                len -= 5;
            } else if (len >= 5 && S.substring(len - 5, len).equals("erase")) {
                len -= 5;
            } else if (len >= 6 && S.substring(len - 6, len).equals("eraser")) {
                len -= 6;
            } else if (len >= 7 && S.substring(len - 7, len).equals("dreamer")) {
                len -= 7;
            } else {
                System.out.println("NO");
                return;
            }
        }
    }
}
