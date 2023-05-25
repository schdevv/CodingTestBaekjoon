import java.util.*;

public class Solution {
    public int solution(int[] topping) {
        int n = topping.length;
        int[] prefix = new int[n+1];
        int[] suffix = new int[n+1];
        Map<Integer, Integer> map = new HashMap<>();

        // Calculate the prefix array
        for (int i = 0; i < n; i++) {
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
            prefix[i+1] = map.size();
        }

        map.clear();

        // Calculate the suffix array
        for (int i = n - 1; i >= 0; i--) {
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
            suffix[i] = map.size();
        }

        // Find the split point
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (prefix[i] == suffix[i]) answer++;
        }

        return answer;
    }
}