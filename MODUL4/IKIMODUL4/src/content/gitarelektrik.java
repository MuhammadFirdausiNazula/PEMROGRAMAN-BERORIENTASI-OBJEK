package content;

public class gitarelektrik extends item implements alatelektronik {
    String ket;

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }

    public void yahama() {
        setMerk("Yahama");
        setModel("Double");
        setHarga(1500000);
        setPromo(true);

        if (isPromo()) {
            setKet("On Sale!");
            setDiskon(MAXDiscount);
        } else {
            setKet("Sold Out!");
        }
    }
}
