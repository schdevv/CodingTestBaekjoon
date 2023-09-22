class Solution {
    public int solution(int slice, int n) {
        if(slice >= 2 && slice <= 10 && n >= 1 && n <= 100){
            int answer = n / slice;
            if(n % slice != 0){
                answer ++;
            }
          return answer;
        }
        return 0;
    }
}