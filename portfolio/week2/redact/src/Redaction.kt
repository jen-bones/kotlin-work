// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(inStr: String, redStr: String, redChar: Char = 'X'): String {
    var outStr = ""; var repStr = ""
    
    if (redStr != ""){
        repeat(redStr.length){repStr = repStr + redChar}
        outStr = inStr
        
        while(inStr.contains(redStr)){
            outStr = inStr.replace(redStr, repStr)
        }

    } else {
        outStr = inStr
    }   
    
    return outStr
}