import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, sum, temp, digit;

        A = sc.nextInt();
        B = sc.nextInt();
        sum = 0;
        temp = 0;
        digit = 1;

        while(B > 0){
            temp = A * (B % 10);
            System.out.println(temp);

            sum += temp * digit;
            
            B /= 10;
            digit *= 10;
        }
        System.out.println(sum);
    }
}
