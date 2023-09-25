public class Tamagotchi {
    private String name;
    private boolean Hungry = false;

    public String getName() {
        return name;
    }

    public Tamagotchi(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return Hungry;
    }

    public void fullTummy() {
        Hungry = false;
    }
}
