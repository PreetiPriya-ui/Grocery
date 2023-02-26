import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemTest {
    @Test
    void shouldCostFortyRupeesWhenTwoKgOnionIsPurchased() {
        Cost rateOfOnion = new Cost(20);
        Item onion = new Item("Onion", rateOfOnion, Unit.kg);
        Weight weight = new Weight(2, Unit.kg);
        Cost expected = new Cost(40);

        Cost actualCost = onion.findCostOfPurchasedQuantity(weight);

        Assertions.assertEquals(expected, actualCost);
    }

    @Test
    void shouldCostTenRupeesWhenFiveHundredGramOnionIsPurchased() {
        Cost rateOfOnion = new Cost(20);
        Item onion = new Item("Onion", rateOfOnion, Unit.kg);
        Weight weight = new Weight(500, Unit.gm);
        Cost expected = new Cost(10);

        Cost actual = onion.findCostOfPurchasedQuantity(weight);

        Assertions.assertEquals(expected, actual);
    }
}
