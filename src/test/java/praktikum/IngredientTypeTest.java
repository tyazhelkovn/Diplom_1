package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTypeTest {

    @Test
    public void values() {
        assertEquals("SAUCE", IngredientType.SAUCE.name());
    }

    @Test
    public void valueOf() {
        assertEquals("FILLING", IngredientType.FILLING.name());
    }
}
