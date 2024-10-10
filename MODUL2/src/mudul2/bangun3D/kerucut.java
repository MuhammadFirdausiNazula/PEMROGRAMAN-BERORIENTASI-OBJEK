package mudul2.bangun3D;

import mudul2.LKBangun3D;

public class kerucut extends LKBangun3D {
    private double jarijari;
    private double tinggi;

    @Override
    public void hitungVolume() {
        double volume = 3.14*(jarijari*jarijari*tinggi)/3;
        setVolume(volume);
        super.hitungVolume();
    }

    public void infoBangun(double jarijari,double tinggi){
        System.out.println("jari jari kerucut = " +getJarijari());
        System.out.println("tinggi kerucut = " +getTinggi());
        super.infoBangun();
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
