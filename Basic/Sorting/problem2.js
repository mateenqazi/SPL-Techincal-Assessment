
var array = [-3, -6, 0, -56, -32, -5, -89, -32];
var largest = -Number.POSITIVE_INFINITY;
for (i = 0; i <= array.length; i++) {
    if (array[i] > largest) {
        largest = array[i];
    }
}
console.log('largest', largest)