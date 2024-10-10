package mudul2.bangun3D;

import mudul2.LKBangun3D;

public class balok extends LKBangun3D {
    private double panjang;
    private double lebar;
    private double tinggi;

    @Override
    public void hitungVolume() {
        double volume = panjang*lebar*tinggi;
        setVolume(volume);
        super.hitungVolume();
    }

    public void infoBangun(double panjang,double lebar,double tinggi)
    {
        System.out.println("panjang balok = " +getPanjang());
        System.out.println("lebar balok = " +getLebar());
        System.out.println("tinggi balok = " +getTinggi());
        super.infoBangun();
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}

