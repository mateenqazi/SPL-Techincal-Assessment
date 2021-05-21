leftRotate = (arr, k) => {  // es6 function
    let mod = k % arr.length;     // To get the starting point of rotated array 
    let array = []      // helping array
    for (let i = 0; i < arr.length; i++)
        array.push(arr[(mod + i) % arr.length]);    // push the values in new array 
    return array
}
let arr = [2, 3, 4, 5]; // array initialization
let k = 1;
// Function Call for k=1
console.log('array rotate 1 element', leftRotate(arr, k));
// Function Call for k=2
k = 2
console.log('array rotate 2 element', leftRotate(arr, k));
// Function Call for k=3
k = 3
console.log('array rotate 3 element', leftRotate(arr, k));
// Function Call for k=0
k = 0
console.log('array rotate 0 ', leftRotate(arr, k));
