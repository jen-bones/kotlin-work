// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(a: Double, b: Double, c: Double){
init {
    require(listOf(a, b, c).max() < listOf(a, b, c).sum() - listOf(a, b, c).max()) {
        if(listOf(a, b, c).max() < listOf(a, b, c).sum() - listOf(a, b, c).max()) "degenerate triangle provided"
        else "imaginary trianlge provided" 
        }
    }
    
val sideA = a
val sideB = b
val sideC = c
val perimeter = sideA + sideB + sideC
val semiPerimeter = 0.5 * perimeter
val area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)"
    }
}