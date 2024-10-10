import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plant plant = new Plant();
        Armor armor = new Armor(50);
        ArmoredZombie armoredZombie = new ArmoredZombie(100, armor);
        WalkingZombie walkingZombie = new WalkingZombie(100);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=================================");
            System.out.println("1. Serang ArmoredZombie");
            System.out.println("2. Serang WalkingZombie");
            System.out.println("3. Lihat status Zombie");
            System.out.println("4. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih aksi (1-4): ");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    System.out.println("====== Plant menyerang ArmoredZombie ======");
                    plant.attack(armoredZombie);
                    System.out.println("====== Zombie Info ======");
                    printZombieInfo(armoredZombie);
                    System.out.println();
                    if (armoredZombie.getHealth() == 0) {
                        System.out.println("====== Zombie Mati ======");
                    }
                    break;
                case 2:
                    System.out.println("====== Plant menyerang WalkingZombie ======");
                    plant.attack(walkingZombie);
                    System.out.println("====== Zombie Info ======");
                    printZombieInfo(walkingZombie);
                    System.out.println();
                    if (walkingZombie.getHealth() == 0) {
                        System.out.println("====== Zombie Mati ======");
                    }
                    break;
                case 3:
                    System.out.println("====== Status Zombie ======");
                    printZombieInfo(armoredZombie);
                    printZombieInfo(walkingZombie);
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1 dan 4.");
            }
        }
    }

    public static void printZombieInfo(Zombie zombie) {
        if (zombie instanceof ArmoredZombie) {
            System.out.println("Zombie: ArmoredZombie");
            System.out.println("Health: " + zombie.getHealth());
            System.out.println("Armor: " + ((ArmoredZombie) zombie).getArmor().getStrength());
        } else if (zombie instanceof WalkingZombie) {
            System.out.println("Zombie: WalkingZombie");
            System.out.println("Health: " + zombie.getHealth());
        }
    }
}
