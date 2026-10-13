// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(inStr: String, redStr: String, redChar: Char = 'X'): String {
    var outStr = ""; var repStr = ""
    repeat(redStr.length){repStr = repStr + redChar}
    while(inStr.contains(redStr)){
        outStr = inStr.replace(redStr, repStr)
        }     
    
    return outStr
}