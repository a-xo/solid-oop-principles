package interface_segregation.bad;

public class Cat implements Animal, Communicable, Walkable {
    @Override
    public String nameOfAnimal() {
        return "cat";
    }

    @Override
    public String walk() {
        return "the " + nameOfAnimal() + " is walking!";
    }

    @Override
    public String talk() {
        return "meow!";
    }

}
