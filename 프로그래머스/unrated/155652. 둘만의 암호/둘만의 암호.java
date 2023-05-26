public class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for (char ch : s.toCharArray()) {
            int charIndex = 0;
            while (charIndex < index) {
                ch++;
                if (ch > 'z') {
                    ch = 'a';
                }
                if (skip.indexOf(ch) == -1) {
                    charIndex++;
                }
            }
            answer += ch;
        }
        return answer;
    }
}