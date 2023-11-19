function solution(num_list) {
    var answer = [...num_list]
    const a = answer[num_list.length-1]
    const b = answer[num_list.length-2]
   if(a>b){
       answer.push(a-b)
   }else if (a<=b){
       answer.push(a*2)
   }else false
    return answer
}