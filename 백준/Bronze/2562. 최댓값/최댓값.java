import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, pos = 0;
        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
                pos = i;
            }
        }
        System.out.println(max);
        System.out.println(pos);
        sc.close();
    }
}