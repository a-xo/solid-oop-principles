package interface_segregation.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FlyableTest {
    @Test
    public void itShouldBeAbleToFly() {
        Flyable animal = new Duck();
        assertEquals("the duck is flying!", animal.fly());
    }
}