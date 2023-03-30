class Solution {
    public String solution(String s) {
        String answer = "";
        String temp[] = s.split(" ");
        int min = Integer.parseInt(temp[0]);
        int max = Integer.parseInt(temp[0]);

        for(String strTemp : temp) {
            int n = Integer.parseInt(strTemp);

            if (n <= min)
                min = n;
            if (n >= max)
                max = n;
        }
        
        answer = String.format("%d %d", min, max);
        return answer;
    }
}