import java.util.Scanner;
public class Modul3Pratice {
    private double value;

    public double setValue(double value, String params) {
        this.value = value;
        System.out.println("Nilai " + params + " telah di-set menjadi " + value);
        return value;
    }

    public double getValue() {
        return value;
    }

    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);
        double yard, result;
        int choice;
        System.out.println("=====Yard Converter to m, cm, feet & miles=====");
        System.out.println("1. Yard to M");
        System.out.println("2. Yard to CM");
        System.out.println("3. Yard to Feet");
        System.out.println("4. Yard to Miles");
        System.out.println("===============================================");
        System.out.print("Pilih menu: ");
        choice = scanner.nextInt();
        System.out.print("Masukkan Yard: ");
        yard = scanner.nextDouble();
        switch (choice) {
            case 1:
                result = converter.setValueToM(yard);
                System.out.println("Hasil konversi: " + result);
                break;
            case 2:
                result = converter.setValueToCM(yard);
                System.out.println("Hasil konversi: " + result);
                break;
            case 3:
                result = converter.setValueToFeet(yard);
                System.out.println("Hasil konversi: " + result);
                break;
            case 4:
                result = converter.setValueToMiles(yard);
                System.out.println("Hasil konversi: " + result);
                break;
            default:
                System.out.println("Menu yang Anda pilih tidak tersedia");
        }
    }
}

