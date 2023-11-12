function solution(a, b) {
    var atob = String(a) + String(b)
    var btoa = String(b) + String(a)
    
    return atob >= btoa ? Number(atob) : Number(btoa);
}