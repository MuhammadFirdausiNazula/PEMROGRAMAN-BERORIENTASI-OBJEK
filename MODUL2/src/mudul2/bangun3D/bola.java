package mudul2.bangun3D;

import mudul2.LKBangun3D;

public class bola extends LKBangun3D {
    private double jarijari;

    @Override
    public void hitungVolume() {
        double volume = 4*3.14*jarijari;
        setVolume(volume);
        super.hitungVolume();
    }

    public void infoBangun(double jarijari){
        System.out.println("jari jari bola = " +getJarijari());
        super.infoBangun();
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
}
