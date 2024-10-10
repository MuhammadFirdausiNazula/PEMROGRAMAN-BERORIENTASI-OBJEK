package content;

import java.time.LocalDate;

public class Voucher {

    private LocalDate validUntil = LocalDate.of(2023, 5, 25);

    public boolean isValid() {
        LocalDate now = LocalDate.now();
        if (now.isBefore(validUntil)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * public String kode;
     * public LocalDate berlaku;
     * public double diskon;
     * 
     * public String getKode() {
     * return kode;
     * }
     * 
     * public void setKode(String kode) {
     * this.kode = kode;
     * }
     * 
     * public double getDiskon() {
     * return diskon;
     * }
     * 
     * public void setDiskon(double diskon) {
     * this.diskon = diskon;
     * }
     * 
     * Voucher(int tahun, int bulan, int tanggal, String kode){
     * this.berlaku = LocalDate.of(tahun,bulan,tanggal);
     * this.kode = kode;
     * }
     * 
     * public boolean verifikasi(){
     * LocalDate now = LocalDate.now();
     * return now.isBefore(berlaku);
     * }
     */
}
