import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt = 0;

        while (!s.equals("1")) {
            cnt++;
            String temp = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    temp += "1";
                } else {
                    zeroCnt++;
                }
            }
            s = Integer.toBinaryString(temp.length());
        }

        answer[0] = cnt;
        answer[1] = zeroCnt;

        return answer;
    }
}
