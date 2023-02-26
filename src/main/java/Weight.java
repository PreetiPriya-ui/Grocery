import java.util.Objects;

public class Weight {
    private final Unit unit;
    private final double value;

    public Weight(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || getClass() != obj.getClass()) return false;
        Weight weight = (Weight) obj;
        return value == weight.value && unit == weight.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    public double convertValueToBase() {
        return this.value / unit.getConversionRate();
    }
}

