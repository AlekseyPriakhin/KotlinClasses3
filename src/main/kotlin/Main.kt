fun main(args: Array<String>) {
   val animals = listOf(Cat("голубь","уличный",true),
                        Dog("свинина","домашняя",false),
                        Horse("сахар","домашняя",true))

    val doctor : Ibolit = Ibolit();

    for (animal in animals)
    {
        doctor.treatAnimal(animal);
    }
}




