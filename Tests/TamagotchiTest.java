import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TamagotchiTest {
    @Test
    void hungryAfterEating(){
        Tamagotchi t = new Tamagotchi("Tammy");
        t.fullTummy();
        assertFalse(t.isHungry());
    }

    @Test
    void testHungry() {
        Tamagotchi t = new Tamagotchi("Tammy");
        assertFalse(t.isHungry());
    }

    @Test
    void getName() {
        Tamagotchi t = new Tamagotchi("Tammy");
        assertEquals("Tammy", t.getName());
    }
}