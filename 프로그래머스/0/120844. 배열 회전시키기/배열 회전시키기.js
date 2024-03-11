function solution(numbers, direction) {
    var answer = [];
    
    if (direction === "left") {

        answer = numbers.slice(1).concat(numbers.slice(0, 1));
    } else if (direction === "right") {
        
        answer = numbers.slice(-1).concat(numbers.slice(0, -1));
    }
    
    return answer;
}