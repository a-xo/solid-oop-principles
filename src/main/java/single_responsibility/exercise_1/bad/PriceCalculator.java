package single_responsibility.exercise_1.bad;

public class PriceCalculator {
    static double calculatePriceWithTax(Product product, country country) {
        return product.getPrice() * (1 + country.getTaxAmount());
    }
}
