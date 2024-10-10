package content;

public class kasiran {
    public double hargasekarang;
    public double hargadiskon;

    public double total;

    public double getTotal() {
        this.total = hargasekarang - (hargasekarang * hargadiskon);
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Object vouchers[][] = {
            { "Sogem", "Mendem", "LG", "random" },
            { 0.05, 0.06, 0.03, 0.09 }
    };

    public void kodevoucher(String kode) {
        for (int i = 0; i < vouchers.length + 2; i++) {
            if (kode.equals(vouchers[0][i])) {
                adddiskon((double) vouchers[1][i]);
                System.out.println("Selamat anda mendapatkan Potongan harga!");
                System.out.println((double) vouchers[1][i] * 100);
            }
        }
    }

    public void addharga(double harga) {
        hargasekarang += harga;
    }

    public void adddiskon(double diskon) {
        hargadiskon += diskon;
    }

}
