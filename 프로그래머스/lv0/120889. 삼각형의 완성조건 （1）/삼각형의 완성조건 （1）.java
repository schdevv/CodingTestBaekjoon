class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        
        if(a + b > c && a + c > b && b + c > a){
             
            return 1;
        } else { 
            return 2;
        }
    }
}