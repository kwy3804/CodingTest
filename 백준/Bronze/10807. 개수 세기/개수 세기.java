import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Integer[] nums = new Integer[count];

        for(int i=0; i<count; i++)
            nums[i] = sc.nextInt();

        int findNum = sc.nextInt();
        System.out.println(Collections.frequency(Arrays.asList(nums), findNum));
    }
}