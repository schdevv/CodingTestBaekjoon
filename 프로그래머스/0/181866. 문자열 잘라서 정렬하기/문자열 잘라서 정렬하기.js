function solution(myString) {
    let parts = myString.split("x");
    
    parts = parts.filter(part => part.length > 0).sort();

    return parts;
}
