// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(tri: Triangle): Boolean {
    val validity = if (tri.toList().max() < tri.toList().sum() - tri.toList().max()) true else false
    return validity
}

fun triangleArea(tri: Triangle): Double {
    val s = (0.5 * (tri.first + tri.second + tri.third)) 
    val area = Math.sqrt(s * (s - tri.first) * (s - tri.second) * (s - tri.third))
    return area
}