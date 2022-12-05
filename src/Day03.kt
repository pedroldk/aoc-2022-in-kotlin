fun main() {

    fun findCommonItem(rucksack: String): Char {
        val compartments = rucksack.substring(0 until (rucksack.length / 2)) to rucksack.substring(rucksack.length / 2)
        return compartments.first.toCharArray().first { compartments.second.contains(it) }
    }
    fun findBadgeItem(rucksack: List<String>): Char {
        return rucksack.first().toCharArray().first { rucksack[1].contains(it) && rucksack[2].contains(it) }
    }

    val charString = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    fun part1(input: List<String>): Int {
        return input.map { findCommonItem(it) }.sumOf { charString.indexOf(it) }
    }

    fun part2(input: List<String>): Int {
        return input.chunked(3).map { findBadgeItem(it) }.sumOf { charString.indexOf(it) }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03_test")
    //check(part1(testInput) == 15)
    //check(part2(testInput) == 45000)

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}
