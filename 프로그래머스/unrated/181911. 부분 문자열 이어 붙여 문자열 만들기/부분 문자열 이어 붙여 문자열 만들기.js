function solution(my_strings, parts) {
    var answer = '';

    for (var i = 0; i < my_strings.length; i++) {
        var str = my_strings[i];
        var part = parts[i];
        var s = part[0];
        var e = part[1];

        var subString = str.substring(s, e + 1);
        answer += subString;
        
        my_strings[i] = str.substring(0, s) + subString + str.substring(e + 1);
    }

    return answer;
}