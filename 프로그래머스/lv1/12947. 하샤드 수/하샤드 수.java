public class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int n = x; // x의 값이 변경되는 것을 방지하기 위해 새로운 변수 n을 생성
        while (n > 0) {
            sum += n % 10; // x의 일의 자리 수를 sum에 더함
            n /= 10; // x의 일의 자리 수를 제거하여 다음 자리 수를 계산함
        }
        if (x % sum == 0) { // x가 sum의 배수인 경우
            return true;
        } else { // x가 sum의 배수가 아닌 경우
            return false;
        }
    }
}