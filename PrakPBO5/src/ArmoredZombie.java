public class ArmoredZombie extends Zombie {
    private Armor armor;

    public ArmoredZombie(int health, Armor armor) {
        super(health);
        this.armor = armor;
    }

    @Override
    public void destroyed() {
        if (armor.getStrength() > 0) {
            armor.destroyed();
        } else {
            health -= health * 0.2;
            if (health < 0) health = 0;
        }
    }
    public Armor getArmor() {
        return armor;
    }
}