public class Item {

    private final String itemName;
    private final Unit unit;
    private final Cost costPerUnitWeight;

    public Item(String itemName, Cost costPerUnitWeight, Unit unit) {
        this.itemName = itemName;
        this.costPerUnitWeight = costPerUnitWeight;
        this.unit = unit;
    }

    public Cost findCostOfPurchasedQuantity(Weight purchasedQuantity) {
        return costPerUnitWeight.costOfPurchasedQuantity(purchasedQuantity);
    }

    public String getItemName() {
        return itemName;
    }
}