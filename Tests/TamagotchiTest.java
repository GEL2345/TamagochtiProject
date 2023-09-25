import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TamagotchiTest {

    @Test
    void getName() {
        Tamagotchi t = new Tamagotchi("Tammy");
        assertEquals("Tammy", t.getName());
    }
}