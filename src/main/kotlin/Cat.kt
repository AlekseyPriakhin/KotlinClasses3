class Cat(
    food : String,
    location : String,
    isFatAndLazy : Boolean
) : Animal(food,location) {
    override fun makeNoise() {
        println("Мяу")
    }

    override fun sleep() {
        println("Кот спит")
    }

    override fun eat() {
        println("Кот ест $food")
    }
}