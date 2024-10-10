public class DemoConv {
    double meter;

    // Konversi meter ke cm
    public double convCM() {
        return meter * 100;
    }

    // Konversi meter ke mm
    public double convMM() {
        return meter * 1000;
    }

    // Menampilkan hasil konversi
    public void dispConv() {
        System.out.print("Nilai meter = " + meter + " m, ");
        System.out.print("Nilai cm = " + convCM() + "0 cm, ");
        System.out.print("Nilai mm = " + convMM() + "0 mm");
    }

    public static void main(String[] args) {

        DemoConv obj = new DemoConv();
        obj.meter = 1; // Mengisi nilai meter
        obj.dispConv(); // Menampilkan hasil konversi
    }

}
