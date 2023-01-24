package interface_segregation.bad;

public class Fish implements Animal, Swimmable {
    @Override
    public String nameOfAnimal() {
        return "fish";
    }

    @Override
    public String swim() {
        return "the " + nameOfAnimal() + " is swimming!";
    }

}
