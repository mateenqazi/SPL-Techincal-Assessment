const removeChar = (str, char) => {   // function which takes two parameter. one is string and other one is those char which remove from string
    let updateString = ""
    for (let i = 0; i < str.length; i++) {
        if (str[i] !== char)        // check the each char of string.
            updateString += str[i]
    }
    return updateString
}

let str = "My.name.is.Qazi.Mateen.Ahmad.I.am.a.fresh.graduate.with.Bachelor.degree.in.Information.Technology.from.PUCIT.University.of.the.Punjab."  // string
console.log('updated string after dot removed -->', removeChar(str, "."))
str = "My name is Qazi Mateen Ahmad.I am a fresh graduate with Bachelor degree in Information Technology from PUCIT University of the Punjab"
console.log('updated string after white space removed -->', removeChar(str, " "))
