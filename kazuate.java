import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        final int ANSWER = 61; // プログラマが設定した2桁の正の整数
        final int MAX_TRIES = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("数あてゲーム");
        System.out.println("2桁の正の整数を当ててください");

        for (int i = 1; i <= MAX_TRIES; i++) {
            System.out.print(i + "回目の入力：");
            int guess = scanner.nextInt();

            // 入力チェック（2桁の正の整数）
            if (guess < 10 || guess > 99) {
                System.out.println("2桁の正の整数を入力してください。");
                i--; // 回数はカウントしない
                continue;
            }

            if (guess == ANSWER) {
                System.out.println("当たり");
                return; // 正解したら終了
            } else {
                int diff = guess - ANSWER;

                if (guess > ANSWER) {
                    System.out.print("設定された数より大きいです。");
                } else {
                    System.out.print("設定された数より小さいです。");
                }

                if (diff >= 20 || diff <= -20) {
                    System.out.print("（20以上差があります）");
                }

                System.out.println();
            }
        }

        System.out.println("残念。正解は " + ANSWER + " でした。");
        scanner.close();
    }
}
