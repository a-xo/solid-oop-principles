package interface_segregation.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommunicableTest {
    @Test
    public void itShouldMakeCorrectCatNoise() {
        Communicable animal = new Cat();
        assertEquals("meow!", animal.talk());
    }

    @Test
    public void tShouldMakeCorrectDogNoise() {
        Communicable animal = new Dog();
        assertEquals("woof!", animal.talk());
    }
    @Test
    public void tShouldMakeCorrectDuckNoise() {
        Communicable animal = new Duck();
        assertEquals("quack!", animal.talk());
    }
}