function solution(arr1, arr2) {
    return arr1.length === arr2.length ? 
           Math.sign(sum(arr1) - sum(arr2)) : 
           Math.sign(arr1.length - arr2.length);
}

function sum(arr) {
    return arr.reduce((a, b) => a + b, 0);
}