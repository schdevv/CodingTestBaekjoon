function solution(num, k) {
    var numStr = num.toString();
    
    for (var i = 0; i < numStr.length; i++) {
        if (parseInt(numStr[i]) === k) {
            return i + 1;
        }
    }
    return -1;
}