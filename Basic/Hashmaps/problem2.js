const isEqual = (o1, o2) => {
    const o1keys = Object.keys(o1)   // get keys of object1
    const o2keys = Object.keys(o2)   // get keys of object2

    if (o1keys.length !== o2keys.length)   // check both object have same number of keys
        return false

    for (let key of o1keys) {           // check both object have same value
        if (o1[key] !== o2[key])
            return false
    }
    return true
}


// case 1 when object are equal
let obj1 = { a: 1, b: 2, c: 3 }  // object initialization
let obj2 = { c: 3, b: 2, a: 1 }  // object initialization
console.log('is equal', isEqual(obj1, obj2))


// case 2 when objects are not equal
obj1 = { a: 6, b: 7 } // object overwrite
obj = { c: 1, d: 2 }  // object overwrite
console.log('is equal', isEqual(obj1, obj2))
