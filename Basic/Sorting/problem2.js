
var array = [-3, -6, 0, 56, -32, -5, -89, -32];
var largest = -Number.POSITIVE_INFINITY;   // initalize var with smallest number
for (i = 0; i <= array.length; i++) {
    if (array[i] > largest) {
        largest = array[i];
    }
}
console.log('array is ', array)
console.log('largest', largest)