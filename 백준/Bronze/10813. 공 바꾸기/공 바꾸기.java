import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = sc.nextInt();

        int[] basket = new int[total];

        for(int i=0; i<total; i++)
            basket[i] = i+1;

        for(int i=0; i<count; i++) {
            int num1 = sc.nextInt()-1;
            int num2 = sc.nextInt()-1;
            int temp = basket[num1];
            basket[num1] = basket[num2];
            basket[num2] = temp;
        }

        for(int i=0;i<total;i++) {
            System.out.print(basket[i] + " ");
        }

        sc.close();
    }
}
