package mudul2.bangun2D;

import mudul2.LKBangun2D;

public class jajargenjang extends LKBangun2D {
    private double alas;
    private double tinggi;
    private double miring;

    @Override
    public void hitungKeliling() {
        double keliling = 2*(alas+miring);
        setKeliling(keliling);
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        double luas = tinggi * alas;
        setLuas(luas);
        super.hitungLuas();
    }

    public void infoBangun(double alas,double tinggi,double miring){
        System.out.println("alas jajar genjang = " +getAlas());
        System.out.println("tinggi jajar genjang = " +getTinggi());
        System.out.println("miring jajar genjang = " +getMiring());
        super.infoBangun();
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getMiring() {
        return miring;
    }

    public void setMiring(double miring) {
        this.miring = miring;
    }
}
