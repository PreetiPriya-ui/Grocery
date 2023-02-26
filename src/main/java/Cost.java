import java.util.Objects;

public class Cost {
    private final double amount;

    public Cost(double amount) {
        this.amount = amount;
    }

    public Cost add(Cost cost) {
        return new Cost(cost.amount + this.amount);
    }

    public Cost costOfPurchasedQuantity(Weight purchasedQuantity) {
        return new Cost(purchasedQuantity.convertValueToBase() * this.amount);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || getClass() != obj.getClass()) return false;
        Cost cost = (Cost) obj;
        return Double.compare(cost.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
