package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BunTest {

    private final String expectedName;
    private final float expectedPrice;

    public BunTest(String expectedName, float expectedPrice) {
        this.expectedName = expectedName;
        this.expectedPrice = expectedPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getBunData() {
        return new Object[][] {
                {"Best Burger", 199.0f},
        };
    }

    @Test
    public void getName() {
        Bun bun = new Bun(expectedName, expectedPrice);
        String actualName = bun.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void getPrice() {
        Bun bun = new Bun(expectedName, expectedPrice);
        float actualPrice = bun.getPrice();
        assertEquals(expectedPrice, actualPrice, 0);
    }
}
