package mudul2.bangun2D;

import mudul2.LKBangun2D;

public class belahketupat extends LKBangun2D {
    private double sisi;
    private double d1;
    private double d2;

    @Override
    public void hitungKeliling() {
        double keliling = 4 * sisi;
        setKeliling(keliling);
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        double luas = (d1*d2)/2;
        setLuas(luas);
        super.hitungLuas();
    }

    public void infoBangun(double sisi,double d1,double d2){
        System.out.println("sisi belah ketupat = " +getSisi());
        System.out.println("d1 belah ketupat = " +getD1());
        System.out.println("d2 belah ketupat = " +getD2());
        super.infoBangun();
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }
}
