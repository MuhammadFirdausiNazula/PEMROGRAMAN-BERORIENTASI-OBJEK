abstract class hewan {
    String suara;

    public String getSuara() {

        return suara;
    }

    public void setSuara(String suara) {

        this.suara = suara;
    }

    public abstract void bersuara();

    public abstract void info();
}

interface karnivora {
    String makanan = "Daging";
    String jenis = "Karnivora";

    void makan();

    void Jenis();
}

interface herbivora {
    String makanan = "Tumbuhan";
    String jenis = "Herbivora";

    void makan();

    void Jenis();

}

class kucing extends hewan implements karnivora {

    @Override
    public void bersuara() {
        System.out.println("Suara : Meongggggg");
    }

    @Override
    public void makan() {
        System.out.println("Makanan: " + karnivora.makanan);

    }

    @Override
    public void Jenis() {
        System.out.println("Jenis  : " + herbivora.jenis);
    }

    @Override
    public void info() {
        System.out.println("=====================");
        System.out.println("Hewan : Kucing");
        bersuara();
        makan();
        Jenis();
    }
}

class anjing extends hewan implements karnivora {

    @Override
    public void bersuara() {

        System.out.println("Suara : Ngguukkk-ngguukkk");
    }

    @Override
    public void makan() {
        System.out.println("Makanan:" + makanan);
    }

    @Override
    public void Jenis() {
        System.out.println("Jenis : " + jenis);
    }

    @Override
    public void info() {
        System.out.println("=====================");
        System.out.println("Hewan : Anjing");
        bersuara();
        makan();
        Jenis();
    }
}

class beruang extends hewan implements karnivora, herbivora {

    @Override
    public void bersuara() {
        System.out.println("Suara : haummmm");
    }

    @Override
    public void makan() {
        System.out.println("Makanan: " + karnivora.makanan + "+" + "" + herbivora.makanan);
    }

    @Override
    public void Jenis() {
        System.out.println("Jenis : " + karnivora.jenis + "+" + "" + herbivora.jenis);
    }

    @Override
    public void info() {
        System.out.println("=====================");
        System.out.println("Hewan : Beruang");
        bersuara();
        makan();
        Jenis();
    }
}

class kuda extends hewan implements herbivora {

    @Override
    public void bersuara() {
        System.out.println("Suara : iiiihhaaaa ");
    }

    @Override
    public void makan() {
        System.out.println("Makanan: " + makanan);
    }

    @Override
    public void Jenis() {
        System.out.println("Jenis : " + jenis);
    }

    @Override
    public void info() {
        System.out.println("=====================");
        System.out.println("Hewan : Kuda");
        bersuara();
        makan();
        Jenis();
        System.out.println("=====================");
    }
}

public class Main {
    public static void main(String[] args) {

        // (untuk memanggil kucing)
        kucing k = new kucing();
        k.info();

        // (untuk memanggil anjing)
        anjing a = new anjing();
        a.info();

        // (untuk memanggil beruang)
        beruang b = new beruang();
        b.info();

        // (untuk memanggil kuda)
        kuda ku = new kuda();
        ku.info();

    }
}