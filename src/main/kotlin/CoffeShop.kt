abstract class CoffeShop(val americanoPrice: Double, val cappucinoPrice: Double, val lattePrice: Double) {
    var americanoCount = 0
    var cappucinoCount = 0
    var latteCount = 0

    abstract fun makeAmericano()
    abstract fun makeCappucino()
    abstract fun makeLatte()
    fun showStatistics() {
        println("Americano sold: $americanoCount")
        println("Cappucino sold: $cappucinoCount")
        println("Latte sold: $latteCount")
        val money = americanoCount * americanoPrice + cappucinoCount* cappucinoPrice + latteCount* lattePrice
        println("Money earned: $money")
    }
}