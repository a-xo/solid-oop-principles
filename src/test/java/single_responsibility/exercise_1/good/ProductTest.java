package single_responsibility.exercise_1.good;

import org.junit.jupiter.api.Test;
import single_responsibility.exercise_1.bad.Country;
import single_responsibility.exercise_1.bad.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    public void itShouldCalculatePriceWithTax() {
        assertEquals(0.2,
                new Product("name", 1.0).calculatePriceWithTax(Country.FRANCE));
    }

}

