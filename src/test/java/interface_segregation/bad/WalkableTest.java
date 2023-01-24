package interface_segregation.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalkableTest {
    @Test
    public void itShouldMakeCorrectCatMovement() {
        Walkable animal = new Cat();
        assertEquals("the cat is walking!", animal.walk());
    }
 @Test
    public void itShouldMakeCorrectDogMovement() {
        Walkable animal = new Dog();
        assertEquals("the dog is walking!", animal.walk());
    }
@Test
    public void itShouldMakeCorrectDuckMovement() {
        Walkable animal = new Duck();
        assertEquals("the duck is walking!", animal.walk());
    }

}