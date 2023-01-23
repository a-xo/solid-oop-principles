package single_responsibility.exercise_1.bad;

public enum Country {
    GERMANY(0.19),
    SPAIN(0.21),
    UK(0.2),
    FRANCE(0.2);

    private final double taxAmount;
    Country(double taxAmount) {
        this.taxAmount = taxAmount;
    }
    double getTaxAmount() {
        return this.taxAmount;
    }
}
