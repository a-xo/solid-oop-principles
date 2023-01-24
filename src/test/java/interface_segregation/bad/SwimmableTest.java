package interface_segregation.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwimmableTest {
    @Test
    public void itShouldBeAbleToSwimIfFish() {
        Swimmable animal =  new Fish();
        assertEquals("the fish is swimming!", animal.swim());
    }
    @Test
    public void itShouldBeAbleToSwimIfDuck() {
        Swimmable animal =  new Duck();
        assertEquals("the duck is swimming!", animal.swim());
    }
}