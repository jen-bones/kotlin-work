// COMP2850 Portfolio: Week 3
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun invalidTriangleHandler(tri: Triangle){
        if((tri.toList().max()) == (tri.toList().sum() - tri.toList().max())){
            throw IllegalArgumentException("degenerate triangle provided")
        } else {
            throw IllegalArgumentException("imaginary trianlge provided")
        }
}

fun isValidTriangle(tri: Triangle): Boolean {
    val validity = if (tri.toList().max() < tri.toList().sum() - tri.toList().max()) true else false
    return validity    
}

fun triangleArea(tri: Triangle): Double {
    if(isValidTriangle(tri)==false){
        invalidTriangleHandler(tri)
    }
    val s = (0.5 * (tri.first + tri.second + tri.third)) 
    val area = Math.sqrt(s * (s - tri.first) * (s - tri.second) * (s - tri.third))
    return area
}