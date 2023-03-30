class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        int length = arr.length;
        int total = 0;
        
        for(int i = 0; i < length; i++) {
            total = total + arr[i];
        }
        
        answer = total / (double)length;
        return answer;
    }
}