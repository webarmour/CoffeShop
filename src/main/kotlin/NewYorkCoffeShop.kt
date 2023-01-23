class NewYorkCoffeShop(americanoPrice: Double, cappucinoPrice: Double, lattePrice: Double):
    CoffeShop(americanoPrice, cappucinoPrice, lattePrice) {

    override fun makeAmericano() {
        americanoCount++
        println("Thanks for Americano in New York")
    }

    override fun makeCappucino() {
        cappucinoCount++
        println("Thanks for Cappucino in New York")

    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for Latte in New York")

    }
}