public class Tamagotchi {
    private String name;
    private int ageInDays;
    private float height;

    public Tamagotchi(String name, int ageInDays, float height) {
        this.name = name;
        this.ageInDays = ageInDays;
        this.height = height;
    }

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

    public int getAgeinDays() {
        return ageInDays;
    }

    public float getHeight() {
        return height;
    }
}
