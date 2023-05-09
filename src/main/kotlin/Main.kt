fun main() {

}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)
fun opperations(numbers: Array<Int>) {
    // (i) prints out the sum of the second and fifth elements
    val sum = numbers[1] + numbers[4]
    println("Sum of second and fifth elements: $sum")

    // (ii) prints out the index of 158
    val index = numbers.indexOf(158)
    println("Index of 158: $index")

    // (iii) prints out the elements in ascending order
    val sortedNumbers = numbers.sorted()
    println("Elements in ascending order: $sortedNumbers")
}


//2. Given a list of Person objects, each with the attributes, name, age, height,
//and weight. Sort the list in order of descending age (2 points)


//3. Create a function that takes in 3 names and returns a string array
//containing all 3 names. (2 points)

//4. Write a function that takes in a list of Car objects each with a registration
//and mileage attribute and returns the
//average mileage of all the vehicles in the list. (3 points)