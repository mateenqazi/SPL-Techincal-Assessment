function isSubSequence(str1, str2) {
    let j = 0;

    // Traverse str2 and str1, and compare
    // current character of str2 with first
    // unmatched char of str1, if matched
    // then move ahead in str1
    for (let i = 0; i < str2.length && j < str1.length; i++)
        if (str1[j] == str2[i])
            j++;

    // If all characters of str1 were found
    // in str2
    return (j == str1.length);
}
let str1 = "gksrek";
let str2 = "geeksforgeeks"

// case 1 when substring exist
console.log('result 1', isSubSequence(str1, str2))


// case 2 when substring does not exist
str1 = "abc"
str2 = "zxcvbnn"
console.log('result 2', isSubSequence(str1, str2))


// case 3 when string 1 length is zero so it satify the condition 
str1 = ""
str2 = "zxcvbnn"
console.log('result 3', isSubSequence(str1, str2))


