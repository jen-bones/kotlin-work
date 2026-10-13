// Task 7.7.1: statistics functions
fun median(values: List<Float>): Float{
    if(values.size == 0){
        throw IllegalArgumentException("List must not be empty!")
    }
       
    if (values.size % 2 == 1){
        return values.sorted()[((values.size + 1)/2) - 1]
    } else {
        return values.sorted()[(values.size/2)-1] + values.sorted()[(((values.size/2) + 1) / 2)-1]
    }
}