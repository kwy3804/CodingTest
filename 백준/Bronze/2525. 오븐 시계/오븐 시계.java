import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = sc.nextInt();
        int time_hour = time / 60;
        int time_min = time % 60;
        H += time_hour;
        M += time_min;
        
        if(M >= 60) {
            M -= 60;
            H += 1;
        }
        if(H >= 24)
            H -= 24;

        System.out.printf("%d %d", H, M);
    }
}
