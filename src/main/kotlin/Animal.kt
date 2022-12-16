abstract class Animal(
    open val food : String,
    open val location : String
)
{
    abstract fun makeNoise();
    abstract fun sleep();
    abstract fun eat();
}