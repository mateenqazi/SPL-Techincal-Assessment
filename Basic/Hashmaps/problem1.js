const checkSubSequence = (str1, str2) => {
    let j = 0;
    for (let i = 0; i < str2.length && j < str1.length; i++)  // traverse loop 
        if (str1[j] == str2[i])
            j++;
    return (j == str1.length);
}
let str1 = "pu";
let str2 = "punjab"

// case 1 when substring exist
console.log('result 1', checkSubSequence(str1, str2))


// case 2 when substring does not exist
str1 = "abc"
str2 = "zxcvbnn"
console.log('result 2', checkSubSequence(str1, str2))


// case 3 when string 1 length is zero so it satify the condition 
str1 = ""
str2 = "zxcvbnn"
console.log('result 3', checkSubSequence(str1, str2))


