fun main() {
    fun getCarriersValues(input: List<String>): MutableList<Int> {
        val biggestCarriers = mutableListOf<Int>()
        var sum = 0
        for (line in input) {
            if (line == "") {
                biggestCarriers.add(sum)
                sum = 0
            } else {
                sum += line.toInt()
            }
        }

        if (sum != 0) {
            biggestCarriers.add(sum)
        }
        return biggestCarriers
    }

    fun part1(input: List<String>): Int {
        val biggestCarriers = getCarriersValues(input)

        return biggestCarriers.max()
    }

    fun part2(input: List<String>): Int {
        val biggestCarriers = getCarriersValues(input).sortedDescending()
        return biggestCarriers[0] + biggestCarriers[1] + biggestCarriers[2]
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    //check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
