let array = [1, 2, 3, 4, 5]   // array initialization


// solution no 1
let array1 = []
for (let i = array.length - 1; i >= 0; i--) {
    array1.push(array[i])
}
console.log('solution no 1', array1)


// solution no 2
console.log('solution no 2', array.reverse())
