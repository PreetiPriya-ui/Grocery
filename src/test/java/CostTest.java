import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CostTest {
    @Test
    void shouldReturnThirtyWhenWeAddTwentyAndTen() {
        Cost twenty = new Cost(20.0);
        Cost ten = new Cost(10.0);
        Cost expected = new Cost(30.0);

        Cost actual = twenty.add(ten);

        assertEquals(expected, actual);
    }


}
