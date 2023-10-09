class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] numChar = num_str.split("");

        for(String s : numChar){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}