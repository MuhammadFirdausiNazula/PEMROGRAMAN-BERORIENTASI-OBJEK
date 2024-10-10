public class Armor {
    private int strength;

    public Armor(int strength) {
        this.strength = strength;
    }

    public void destroyed() {
        strength -= strength * 0.2;
        if (strength < 0) strength = 0;
    }

    public int getStrength() {
        return strength;
    }
}
