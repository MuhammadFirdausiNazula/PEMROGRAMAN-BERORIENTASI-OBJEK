package mudul2.bangun2D;

import mudul2.LKBangun2D;

public class persegipanjang extends LKBangun2D {
    private double panjang;
    private double lebar;

    @Override
    public void hitungKeliling() {
        double keliling = 2*(panjang+lebar);
        setKeliling(keliling);
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        double luas = panjang*lebar;
        setLuas(luas);
        super.hitungLuas();
    }

    public void infoBangun(double panjang, double lebar){
        System.out.println("panjang persegi panjang = " +getPanjang());
        System.out.println("lebar persegi panjang = " +getLebar());
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
}
