package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IngredientTest {
    private final IngredientType type;
    private final String name;
    private final float price;

    public IngredientTest(IngredientType type, String name, float price) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Parameterized.Parameters
    public static Object[][] getIngredientData() {
        return new Object[][] {
                {IngredientType.SAUCE, "burgerNameOne", 199.0f},
                {IngredientType.FILLING, "burgerNameTwo", 299.0f},
        };
    }

    @Test
    public void getPrice() {
        Ingredient ingredient = new Ingredient(type, name, price);
        float actualPrice = ingredient.getPrice();
        assertEquals(price, actualPrice, 0);
    }

    @Test
    public void getName() {
        Ingredient ingredient = new Ingredient(type, name, price);
        String actualName = ingredient.getName();
        assertEquals(name, actualName);
    }

    @Test
    public void getType() {
        Ingredient ingredient = new Ingredient(type, name, price);
        IngredientType actualType = ingredient.getType();
        assertEquals(type, actualType);
    }
}
