package grokkingalgorithms

// Граф
private val graph: MutableMap<String, MutableMap<String, Int>> = HashMap()

// Список отслеживания обработанных узлов
private val processed: MutableList<String> = ArrayList()

fun main() {
    graph["start"] = HashMap()
    graph["start"]!!["a"] = 6
    graph["start"]!!["b"] = 2
    graph["a"] = HashMap()
    graph["a"]!!["fin"] = 1
    graph["b"] = HashMap()
    graph["b"]!!["a"] = 3
    graph["b"]!!["fin"] = 5
    graph["fin"] = HashMap()

    // Стоимость узлов
    val costs: MutableMap<String, Int> = HashMap()
    costs["a"] = 6
    costs["b"] = 2
    costs["fin"] = Int.MAX_VALUE

    // Таблица родителей
    val parents: MutableMap<String, String?> = HashMap()
    parents["a"] = "start"
    parents["b"] = "start"
    parents["fin"] = null

    println("Cost from the start to each node:")
    println(dijkstraAlgorithm(costs, parents))
}

fun dijkstraAlgorithm(
    costs: MutableMap<String, Int>,
    parents: MutableMap<String, String?>,
): MutableMap<String, Int> {
    var node = findLowestCostNode(costs)
    while (node != null) {
        val cost = costs[node]
        // Перебрать всех соседей текущего узла
        val neighbors: Map<String, Int> = graph[node]!!
        for (n in neighbors.keys) {
            val newCost = cost!! + neighbors[n]!!
            // Если к соседу можно быстрее добраться через текущий узел...
            if (costs[n]!! > newCost) {
                // ... обновить стоимость для этого узла
                costs[n] = newCost
                // Этот узел становится новым родителем для соседа
                parents[n] = node
            }
        }
        // Узел помечается как обработанный
        processed.add(node)

        // Найти следующий узел для обработки и повторить цикл
        node = findLowestCostNode(costs)
    }
    return costs // { a: 5, b: 2, fin: 6 }
}

private fun findLowestCostNode(costs: Map<String, Int>): String? {
    var lowestCost = Int.MAX_VALUE
    var lowestCostNode: String? = null

    // Перебрать все узлы
    for ((key, cost) in costs) {
        // Если это узел с наименьшей стоимостью из уже виденных и
        // он еще не был обработан...
        if (cost < lowestCost && !processed.contains(key)) {
            // ... он назначается новым узлом с наименьшей стоимостью
            lowestCost = cost
            lowestCostNode = key
        }
    }
    return lowestCostNode
}
