const countFreq = (arr) => {
    let obj = {}
    for (let i = 0; i < arr.length; i++) {
        if (!(arr[i] in obj))    // if new value then initialize in obj
            obj[arr[i]] = 0
        obj[arr[i]] += 1     // add 1 in existing value in obj
    }
    let array = []
    for (key in obj) {
        var obj2 = {};
        obj2[`${key}`] = obj[key];
        array.push(obj2)
    }
    return array
}
arr = [1, 2, 3, 4, 5, 4, 3, 1]
console.log(countFreq(arr))
