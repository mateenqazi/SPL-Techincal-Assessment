function calMean(arr, size) {
    if (size == 1)   // base case
        return arr[size - 1];
    else  // recursive calls
        return ((calMean(arr, size - 1) * (size - 1) + arr[size - 1]) / size);
}
let array = [1, 2, 3, 4, 5, 6, 7, 8, 9];
console.log('mean ->', calMean(array, array.length));