public abstract class Zombie implements Destroyable {
    protected int health;

    public Zombie(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}