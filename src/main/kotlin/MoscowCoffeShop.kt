class MoscowCoffeShop(americanoPrice: Double, cappucinoPrice: Double, lattePrice: Double):
    CoffeShop(americanoPrice, cappucinoPrice, lattePrice), Bisquit {

    override fun makeAmericano() {
        americanoCount ++
        println("Thanks for Americano in Moscow")
    }

    override fun makeCappucino() {
        cappucinoCount ++
        println("Thanks for Cappucino in Moscow")

    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for Latte in Moscow")


    }

    override fun sellBisquit() {
        println("Take your bisquits")
    }

}
