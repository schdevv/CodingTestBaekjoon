function solution(my_string) {
    var answer = '';
    for (var i = 0; i < my_string.length; i++) {
        var char = my_string.charAt(i);
        if (char === char.toUpperCase()) {
            answer += char.toLowerCase();
        } else {
            answer += char.toUpperCase();
        }
    }
    return answer;
}