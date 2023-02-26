import java.util.HashMap;
import java.util.Map;

public class GroceryShop {
    Map<Item, Weight> cart = new HashMap<>();
    Map<String, Cost> bill = new HashMap<>();

    private Cost totalCost = new Cost(0);

    public void addToCart(Item item, Weight weight) {
        cart.put(item, weight);
    }

    public void calculateBill() {
        for (Map.Entry<Item, Weight> order : cart.entrySet()) {
            bill.put(getItemName(order), findCostOfPurchasedItem(order));
            totalCost = totalCost.add(findCostOfPurchasedItem(order));
        }
        bill.put("Total cost", totalCost);

    }

    private Cost findCostOfPurchasedItem(Map.Entry<Item, Weight> order) {
        return order.getKey().findCostOfPurchasedQuantity(order.getValue());
    }

    private String getItemName(Map.Entry<Item, Weight> entry) {
        return entry.getKey().getItemName();
    }


    public Map<String, Cost> getBill() {
        return bill;
    }
}
