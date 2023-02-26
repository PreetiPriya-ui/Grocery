public enum Unit {
    kg(1), gm(1000);

    private final double conversionRate;

    Unit(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public double getConversionRate() {
        return conversionRate;
    }
}
