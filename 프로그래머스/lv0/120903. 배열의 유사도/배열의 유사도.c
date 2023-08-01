#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(const char* s1[], size_t s1_len, const char* s2[], size_t s2_len) {
    int answer = 0;

    for (size_t i = 0; i < s1_len; i++) {
        for (size_t j = 0; j < s2_len; j++) {
            if (strcmp(s1[i], s2[j]) == 0) {
                answer++;
                break; 
            }
        }
    }

    return answer;
}

int main() {
    const char* s1[] = {"a", "b", "c"};
    const char* s2[] = {"com", "b", "d", "p", "c"};
    size_t s1_len = sizeof(s1) / sizeof(s1[0]);
    size_t s2_len = sizeof(s2) / sizeof(s2[0]);

    int result = solution(s1, s1_len, s2, s2_len);
    printf("%d\n", result); 

    return 0;
}