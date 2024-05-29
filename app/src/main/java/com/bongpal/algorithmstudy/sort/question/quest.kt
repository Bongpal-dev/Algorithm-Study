data class Person(val name: String, val age: Int)

val people = listOf(
    Person("Alice", 30),
    Person("Bob", 20),
    Person("Carol", 25)
)

val ageComparator = Comparator<Person> { p1, p2 ->
    println(p1.age - p2.age)
    p1.age - p2.age }
val sortedPeople = people.sortedWith(ageComparator)

fun main() {
    println(sortedPeople)
}

