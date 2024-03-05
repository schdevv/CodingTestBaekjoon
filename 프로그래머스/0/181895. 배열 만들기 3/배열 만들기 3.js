function solution(arr, intervals) {
    const [start1, end1] = intervals[0];
    const [start2, end2] = intervals[1];

    const subArr1 = arr.slice(start1, end1 + 1);
    const subArr2 = arr.slice(start2, end2 + 1);

    const result = [...subArr1, ...subArr2];

    return result;
}