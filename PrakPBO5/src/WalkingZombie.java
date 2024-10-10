public class WalkingZombie extends Zombie {
    public WalkingZombie(int health) {
        super(health);
    }

    @Override
    public void destroyed() {
        health -= health * 0.4;
        if (health < 0) health = 0;
    }
}