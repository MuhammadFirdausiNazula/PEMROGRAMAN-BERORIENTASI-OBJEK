package mudul2;

public class LKBangun3D {
    protected double volume;

    protected void infoBangun(){
        hitungVolume();
    }
    protected void hitungVolume(){
        System.out.println("hasil volume : " +getVolume());
    }

    protected double getVolume() {
        return volume;
    }

    protected void setVolume(double volume) {
        this.volume = volume;
    }
}