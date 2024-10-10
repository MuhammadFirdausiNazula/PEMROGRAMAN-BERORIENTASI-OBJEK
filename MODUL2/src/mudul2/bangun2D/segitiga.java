package mudul2.bangun2D;

import mudul2.LKBangun2D;

public class segitiga extends LKBangun2D {
    private double alas;
    private double tinggi;

    @Override
    public void hitungKeliling() {
        double keliling = alas+alas+alas;
        setKeliling(keliling);
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        double luas = 0.5*alas*tinggi;
        setLuas(luas);
        super.hitungLuas();
    }

    public void infoBangun(double alas,double tinggi){
        System.out.println("alas segitiga = " +getAlas());
        System.out.println("tinggi segitiga = " +getTinggi());
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
}
