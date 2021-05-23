const similar = (a, b) => {    // function which takes strings
    let result = 0;
    const minLength = (a.length > b.length) ? b.length : a.length;
    const maxLength = (a.length < b.length) ? b.length : a.length;
    for (let i = 0; i < minLength; i++) {
        if (a[i] == b[i]) {
            result++;
        }
    }
    return ((result / maxLength) * 100) + "%";
}
console.log(similar("ATATGTATG", "ATATATATG"));
console.log(similar("system", "systemplus"));