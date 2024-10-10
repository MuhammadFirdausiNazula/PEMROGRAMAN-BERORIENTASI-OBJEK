package content;

public abstract class item {

    String merk;
    String model;
    int harga;
    double diskon;
    boolean promo;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public boolean isPromo() {

        return promo;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }


    public int diskonakhir(){
        return (int) (getHarga() - (getHarga()*getDiskon()));
    }

}
