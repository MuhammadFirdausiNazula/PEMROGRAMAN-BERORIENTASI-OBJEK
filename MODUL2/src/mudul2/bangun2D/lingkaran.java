package mudul2.bangun2D;

import mudul2.LKBangun2D;

public class lingkaran extends LKBangun2D {
    private double jarijari;

    @Override
    public void hitungKeliling() {
        double keliling = 2 * 3.14 * jarijari;
        setKeliling(keliling);
        super.hitungKeliling();
    }
    @Override
    public void hitungLuas(){
        double luas = 3.14 * jarijari * jarijari;
        setLuas(luas);
        super.hitungLuas();
    }

    public void infoBangun(double jarijari){
        System.out.println("jari jari lingkaran = " +getJarijari());
        super.infoBangun();
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
}
