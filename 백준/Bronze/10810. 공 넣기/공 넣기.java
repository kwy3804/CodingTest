import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = sc.nextInt();

        int[] basket = new int[total];

        for(int i=0; i<count; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int num = sc.nextInt();
            for(int j=from-1;j<to;j++) {
                basket[j] = num;
            }
        }

        for(int i=0;i<total;i++) {
            System.out.print(basket[i] + " ");
        }

        sc.close();
    }
}