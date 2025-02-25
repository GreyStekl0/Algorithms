package search

val graph =
    hashMapOf(
        "You" to listOf("Sergey", "Viktoria"),
        "Viktoria" to listOf("Sergey", "Vladimir"),
        "Vladimir" to listOf("Sergey", "Andrew", "Nikita", "Boris"),
    )

fun personIsSeller(name: String): Boolean = name.endsWith("s")

fun breadthFirstSearch(name: String) {
    val queue = ArrayDeque(graph[name] ?: emptyList())
    val searched = mutableListOf<String>()
    while (queue.isNotEmpty()) {
        val person = queue.removeFirstOrNull() ?: break
        if (!searched.contains(person)) {
            if (personIsSeller(person)) {
                println("$person is a mango seller!")
                return
            }
            graph[person]?.let { queue.addAll(it) }
            searched.add(person)
        }
    }
    println("No mango sellers found!")
}

fun main() {
    breadthFirstSearch("You")
}
