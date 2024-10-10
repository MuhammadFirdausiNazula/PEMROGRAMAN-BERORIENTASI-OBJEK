package mudul2.bangun2D;

import mudul2.LKBangun2D;

public class persegi extends LKBangun2D {
    private double sisi;

    @Override
    public void hitungKeliling() {
        double keliling = 4 * sisi;
        setKeliling(keliling);
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        double luas = sisi * sisi;
        setLuas(luas);
        super.hitungLuas();
    }

    public void infoBangun(double sisi){
        System.out.println("sisi persegi = " +getSisi());
        super.infoBangun();
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
