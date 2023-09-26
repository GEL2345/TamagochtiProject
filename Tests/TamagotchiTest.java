import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TamagotchiTest {
    Tamagotchi t = new Tamagotchi("Tammy",6, 2.3f);

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
    @Test
    void testTamagotchiCreation() {
        assertAll( "Testing Object Construction",
                () -> assertEquals("Tammy", t.getName()),
                () -> assertEquals(6, t.getAgeinDays()),
                () -> assertEquals(2.3f, t.getHeight())
        );
    }
}