class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int divisors = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    divisors++;
                    if (j != i / j) {
                        divisors++;
                    }
                }
            }
            if (divisors > limit) {
                answer += power;
            } else {
                answer += divisors;
            }
        }
        return answer;
    }
}