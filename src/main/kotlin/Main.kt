import kotlin.system.exitProcess

fun main() {
    val moscowCoffeShop = MoscowCoffeShop(3.0, 4.5, 5.0)
    val newYorkCoffeShop = NewYorkCoffeShop(5.0, 7.5, 8.0)
    var currentCoffeShop: CoffeShop

    while (true) {
        println("Hello! Choose a city!")
        println("1.Moscow\n2.New York\n\n0.Exit")

        currentCoffeShop = when (readLine()) {
            "1" -> moscowCoffeShop
            "2" -> newYorkCoffeShop
            "0" -> break
            else -> {
                println("Произошла ошибка")
                exitProcess(1)
            }
        }
        println("Choose a drink:")
        println("1.Americano\n2.Cappucino\n3.Latte\n\n 0.Show statistics")

        when (readLine()) {
            "1" -> currentCoffeShop.makeAmericano()
            "2" -> currentCoffeShop.makeCappucino()
            "3" -> currentCoffeShop.makeLatte()
            "0" -> currentCoffeShop.showStatistics()
            else -> {
                println("Произошла ошибка")
                exitProcess(1)
            }
        }


    }
    fun checkAndAskForBisquits(currentCoffeShop: CoffeShop){
        if (currentCoffeShop is Bisquit) {
            println("Would you like bisquits?")
            println("1.Yes\n2.No")

            val isBisquits = readLine()

            if (isBisquits == "1")
                currentCoffeShop.sellBisquit()
        }
    }
}