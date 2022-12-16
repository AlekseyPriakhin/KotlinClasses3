import kotlin.reflect.typeOf

class Ibolit {

    fun treatAnimal(animal: Animal)
    {
        when(animal)
        {
            is Dog -> print("собака, ")
            is Horse -> print("лошадь, ")
            is Cat -> print("кот, ")
            else -> print("нечто, ")
        }
        println("еда - ${animal.food}, локация - ${animal.location}")
    }
}