import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, M;

        H = sc.nextInt();
        M = sc.nextInt();

        if(M - 45 >= 0)
            M = M - 45;
        else {
            if (H - 1 >= 0)
                H -= 1;
            else
                H = 23;
            M = M - 45 + 60;
        }

        System.out.printf("%d %d", H, M);
    }
}
