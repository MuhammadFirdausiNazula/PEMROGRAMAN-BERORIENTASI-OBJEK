package mudul2;

public class LKBangun2D {
    protected double luas;
    protected double keliling;

    protected void infoBangun(){
        hitungKeliling();
        hitungLuas();
    }
    protected void hitungKeliling(){
        System.out.println("hasil keliling : " +getKeliling());
    }
    protected void hitungLuas(){
        System.out.println("hasil luas : " +getLuas());

    }

    protected double getLuas() {
        return luas;
    }

    protected void setLuas(double luas) {
        this.luas = luas;
    }

    protected double getKeliling() {
        return keliling;
    }

    protected void setKeliling(double keliling) {
        this.keliling = keliling;
    }
}

