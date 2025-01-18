import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // まずstrArraySubに1文字多い配列を作る
        String[] strArray = new String[s.length()];

        // 変数strの長さ分回す
        for (int i = 0; i < s.length(); i++) {
            // strの先頭から1文字ずつString型にして取り出す
            String str2 = String.valueOf(s.charAt(i));
            // 配列に順番に格納する
            strArray[i] = str2;
        }

        int n = Integer.parseInt(strArray[0]);
        int m = Integer.parseInt(strArray[2]);

        System.out.println(n * m);
    }
}
