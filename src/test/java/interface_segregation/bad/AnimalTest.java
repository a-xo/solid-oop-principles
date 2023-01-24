package interface_segregation.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void itShouldNameAnimalCorrectly() {
        Animal animal = new Cat();
        assertEquals("cat", animal.nameOfAnimal());
    }
}
