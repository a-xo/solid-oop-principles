package single_responsibility.exercise_1.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {
    Product product = new Product("testProduct", 100.00);

    @Test
    public void itShouldCalculatePriceWithTaxAccordingToCountry() {
        assertEquals(120,
                PriceCalculator.calculatePriceWithTax(product, country.FRANCE));
        assertEquals(120,
                PriceCalculator.calculatePriceWithTax(product, country.UK));
        assertEquals(121,
                PriceCalculator.calculatePriceWithTax(product, country.SPAIN));
        assertEquals(119,
                PriceCalculator.calculatePriceWithTax(product, country.GERMANY));
    }
}
