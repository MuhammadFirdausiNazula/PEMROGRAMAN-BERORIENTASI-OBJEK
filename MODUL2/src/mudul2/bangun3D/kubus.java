package mudul2.bangun3D;

import mudul2.LKBangun3D;

public class kubus extends LKBangun3D {
    private double rusuk;

    @Override
    public void hitungVolume() {
        double volume = rusuk*rusuk*rusuk;
        setVolume(volume);
        super.hitungVolume();
    }

    public void infoBangun(double rusuk){
        System.out.println("rusuk kubus = " +getRusuk());
        super.infoBangun();
    }

    public double getRusuk() {
        return rusuk;
    }

    public void setRusuk(double rusuk) {
        this.rusuk = rusuk;
    }
}
