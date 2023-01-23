package single_responsibility.exercise_1.bad;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculatePriceWithTax(Country country) {
        return this.price * (1 + country.getTaxAmount());
    }

    public double calculateTotalPriceWithTaxForOrder(int quantity, Country country) {
        return quantity * calculatePriceWithTax(country);
    }

}