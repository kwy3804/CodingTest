class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int length =  String.valueOf(n).length();
        answer = new int[length];
        int index = 0;
        
        String data = String.valueOf(n);
        
        for (int i = length - 1; i >= 0; i--) {
            answer[index++] = Character.getNumericValue(data.charAt(i));
        }
       
        
        
        return answer;
    }
}