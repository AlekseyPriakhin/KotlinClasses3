class Horse (
    food : String,
    location : String,
    isRiding : Boolean
) : Animal(food,location) {
    override fun makeNoise() {
        println("Игого")
    }

    override fun sleep() {
        println("Лошадь спит")
    }

    override fun eat() {
        println("Лошадь ест $food")
    }
}