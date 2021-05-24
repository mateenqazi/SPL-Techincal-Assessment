function arraypair(array, sum) {
    let array1 = []
    for (i = 0; i < array.length; i++) {
        var first = array[i];
        for (j = i + 1; j < array.length; j++) {
            var second = array[j];
            if ((first + second) == sum) {
                var obj = {}
                obj[`${first}`] = second;
                array1.push(obj)
            }
        }

    }
    return array1
}

var a = [2, 4, 3, 5, 6, -2, 7, 8, 9];
console.log(arraypair(a, 6))