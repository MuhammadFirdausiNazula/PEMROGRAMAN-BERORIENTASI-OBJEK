package content;

public class gitar extends item implements alatmusik{
    String ket;

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }

    public void cort(){
        setMerk("cort");
        setModel("Lefty");
        setHarga(1200000);
        setPromo(true);

        if (isPromo()){
            setKet("On Sale!");
            setDiskon(maxdiskon);
        } else {
            setKet("Sold Out!");
        }
    }
}
