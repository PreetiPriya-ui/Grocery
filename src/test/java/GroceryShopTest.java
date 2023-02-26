import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GroceryShopTest {

    @Test
    void shouldGiveTotalCostWhenWePurchaseMultipleItems() {
        GroceryShop grocery = new GroceryShop();
        grocery.addToCart(new Item("Onion", new Cost(20), Unit.kg), new Weight(500, Unit.gm));
        grocery.addToCart(new Item("Apple", new Cost(200), Unit.kg), new Weight(1, Unit.kg));
        grocery.addToCart(new Item("Rice", new Cost(34.5), Unit.kg), new Weight(3, Unit.kg));
        Map<String, Cost> expectedBill = new HashMap<>();
        expectedBill.put("Onion", new Cost(10));
        expectedBill.put("Apple", new Cost(200));
        expectedBill.put("Rice", new Cost(103.50));
        expectedBill.put("Total cost", new Cost(313.50));

        grocery.calculateBill();
        Map<String, Cost> actualBill = grocery.getBill();

        Assertions.assertEquals(expectedBill, actualBill);
    }
}
