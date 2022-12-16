class Dog (
    food : String,
    location : String,
    isHunting : Boolean
) : Animal(food,location) {
    override fun makeNoise() {
        println("Гав")
    }

    override fun sleep() {
        println("Собака спит")
    }

    override fun eat() {
        println("Собака ест $food")
    }
}