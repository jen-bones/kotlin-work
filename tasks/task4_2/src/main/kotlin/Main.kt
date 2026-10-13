// Task 4.2: use of if and ranges

fun main() {
    var pizza = readln().lowercase()
    if ((pizza.length == 1) && (pizza in 'a'..'d')){
        println("Order accepted")
    }
    else {
        println("Invalid choice!")
    }
}
