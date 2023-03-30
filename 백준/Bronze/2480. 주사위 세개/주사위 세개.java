import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = new int[3];
        for (int i = 0; i < 3; i++) {
            dice[i] = sc.nextInt();
        }
        Arrays.sort(dice);

        int reward = 0;
        if (dice[0] == dice[2]) {
            reward = 10000 + dice[0] * 1000;
        } else if (dice[0] == dice[1] || dice[1] == dice[2]) {
            reward = 1000 + dice[1] * 100;
        } else {
            reward = dice[2] * 100;
        }

        System.out.println(reward);
    }
}