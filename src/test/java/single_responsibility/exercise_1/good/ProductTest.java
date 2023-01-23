package single_responsibility.exercise_1.good;

import org.junit.jupiter.api.Test;
import single_responsibility.exercise_1.bad.Country;
import single_responsibility.exercise_1.bad.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private final Product product = new Product("productName", 1.0);
    @Test
    public void itShouldCalculatePriceWithTaxForFrance() {
        assertEquals(1.2,
                product.calculatePriceWithTax(Country.FRANCE));
    }

    @Test
    public void itShouldCalculateCorrectPriceWithTaxAmountForAnyCountry() {
        assertEquals(1.19, product.calculatePriceWithTax(Country.GERMANY));
        assertEquals(1.21, product.calculatePriceWithTax(Country.SPAIN));
        assertEquals(1.2, product.calculatePriceWithTax(Country.UK));
    }

}

