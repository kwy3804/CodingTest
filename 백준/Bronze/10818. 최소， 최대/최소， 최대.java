import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] nums = new int[count];

        for(int i=0; i<count; i++)
            nums[i] = sc.nextInt();

        int min = nums[0];
        int max = nums[0];

        for(int i=0; i<count; i++) {
            if (nums[i] < min)
                min = nums[i];
            else if (nums[i] > max)
                max = nums[i];
        }

        System.out.printf("%d %d", min, max);
    }
}