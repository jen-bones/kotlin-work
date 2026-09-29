// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(argv: Array<String>){
    if(argv.size < 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val s = (0.5f * (argv[0].toFloat()+argv[1].toFloat()+argv[2].toFloat())) 
    val area = Math.sqrt((s*(s-argv[0].toFloat())*(s-argv[1].toFloat())*(s-argv[2].toFloat())).toDouble()).toFloat()

    println("Area = %.5f".format(area))
}