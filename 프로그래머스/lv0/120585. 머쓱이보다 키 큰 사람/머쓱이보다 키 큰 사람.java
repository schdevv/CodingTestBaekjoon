class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        // 제한사항
        if(array.length < 1 || array.length > 100){
            return 0;
        } 
        if(height < 1 || height > 200){
            return 0;
        }
        for(int h : array) {
            if(h < 1 || h > 200) {
                return 0;
            }
            if(h > height){
               answer ++;
            }
        }
        return answer;
    }
}