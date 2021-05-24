const minAbsDiff = (array) => {
    let res = -Number.NEGATIVE_INFINITY
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length; j++) {
            if (i !== j && ((Math.abs(array[i] - array[j]) < res || res == -1)))   // check abs of element
                res = Math.abs(array[i] - array[j])   // overwrite the value of res
        }
    }
    return res
}

const array = [10, 12, 13, 15, 10]
console.log(minAbsDiff(array))