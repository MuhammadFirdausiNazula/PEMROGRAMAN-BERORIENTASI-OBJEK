package mudul2;

import mudul2.bangun2D.*;
import mudul2.bangun3D.*;
import java.util.Scanner;

public class Main {

    private void MainMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println(" Menghitung luas, keliling, volume ");
        System.out.println("=============================");
        System.out.println("1. Menghitung bangun 2D");
        System.out.println("2. Menghitung bangun 3D");
        System.out.println("0. Keluar");
        System.out.print(" Pilih menu : ");

        int pilih = sc.nextInt();

        if (pilih == 1){
            hitung2D();
            System.out.print("kembali ke menu? y/n ");
            char jwb = sc.next().charAt(0);
            if(jwb=='y' || jwb=='Y'){
                MainMenu();
            } else {
                System.exit(0);
            }
        } else if (pilih == 2) {
            hitung3D();
            System.out.print("kembali ke menu? y/n ");
            char jwb = sc.next().charAt(0);
            if(jwb=='y' || jwb=='Y'){
                MainMenu();
            } else {
                System.exit(0);
            }
        } else {
            System.exit(0);

        }
    }

    private void hitung2D(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Aplikasi Penghitung Luas & Keliling Bangun Datar");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");
        System.out.println("6. Belah Ketupat");
        System.out.println("0. Kembali");
        System.out.println("Pilih menu : ");

        int pilih = sc.nextInt();

        if (pilih == 1) {
            persegi psg = new persegi();
            System.out.print("masukkan sisi : ");
            double sisi = sc.nextDouble();
            psg.setSisi(sisi);
            psg.infoBangun(sisi);
        } else if (pilih == 2) {
            persegipanjang psj = new persegipanjang();
            System.out.print("masukkan panjang : ");
            double panjang = sc.nextDouble();
            System.out.print("masukkan lebar : ");
            double lebar = sc.nextDouble();
            psj.setLebar(lebar);
            psj.setPanjang(panjang);
            psj.infoBangun(lebar,panjang);
        } else if (pilih == 3) {
            segitiga sgt = new segitiga();
            System.out.print("masukkan alas : ");
            double alas = sc.nextDouble();
            System.out.print("masukkan tinggi : ");
            double tinggi = sc.nextDouble();
            sgt.setAlas(alas);
            sgt.setTinggi(tinggi);
            sgt.infoBangun(alas,tinggi);
        } else if (pilih == 4) {
            lingkaran l = new lingkaran();
            System.out.print("masukkan jari jari : ");
            double jarijari = sc.nextDouble();
            l.setJarijari(jarijari);
            l.infoBangun(jarijari);
        } else if (pilih == 5) {
            jajargenjang jj = new jajargenjang();
            System.out.print("masukkan alas : ");
            double alas = sc.nextDouble();
            System.out.print("masukkan tinggi : ");
            double tinggi = sc.nextDouble();
            System.out.print("masukkan miring : ");
            double miring = sc.nextDouble();
            jj.setAlas(alas);
            jj.setTinggi(tinggi);
            jj.setMiring(miring);
            jj.infoBangun(alas,tinggi,miring);
        } else if (pilih == 6) {
            belahketupat bl = new belahketupat();
            System.out.print("masukkan sisi : ");
            double sisi = sc.nextDouble();
            System.out.print("masukkan d1 : ");
            double d1 = sc.nextDouble();
            System.out.print("masukkan d2 : ");
            double d2 = sc.nextDouble();
            bl.setSisi(sisi);
            bl.setD1(d1);
            bl.setD2(d2);
            bl.infoBangun(sisi,d1,d2);
        } else {
            MainMenu();
        }
    }

    private void hitung3D(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Aplikasi Penghitung Volume Bangun Ruang");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Bola");
        System.out.println("5. Kerucut");
        System.out.println("0. Kembali");
        System.out.print("Pilih menu : ");

        int pilih = sc.nextInt();

        if (pilih == 1) {
            kubus kbs = new kubus();
            System.out.print("masukkan rusuk : ");
            double rusuk = sc.nextDouble();
            kbs.setRusuk(rusuk);
            kbs.infoBangun(rusuk);
        } else if (pilih == 2) {
            balok b = new balok();
            System.out.print("masukkan panjang : ");
            double panjang = sc.nextDouble();
            System.out.print("masukkan lebar : ");
            double lebar = sc.nextDouble();
            System.out.print("masukkan tinggi : ");
            double tinggi = sc.nextDouble();
            b.setPanjang(panjang);
            b.setLebar(lebar);
            b.setTinggi(tinggi);
            b.infoBangun(panjang,lebar,tinggi);
        } else if (pilih == 3) {
            tabung t = new tabung();
            System.out.print("masukkan jari jari : ");
            double jarijari =sc.nextDouble();
            System.out.print("masukkan tinggi : ");
            double tinggi = sc.nextDouble();
            t.setJarijari(jarijari);
            t.setTinggi(tinggi);
            t.infoBangun(jarijari,tinggi);
        } else if (pilih == 4) {
            bola ba = new bola();
            System.out.print("masukkan jari jari : ");
            double jarijari = sc.nextDouble();
            ba.setJarijari(jarijari);
            ba.infoBangun(jarijari);
        } else if (pilih == 5) {
            kerucut krc = new kerucut();
            System.out.print("masukkan jari jari : ");
            double jarijari = sc.nextDouble();
            System.out.print("masukkan tinggi : ");
            double tinggi = sc.nextDouble();
            krc.setJarijari(jarijari);
            krc.setTinggi(tinggi);
            krc.infoBangun(jarijari,tinggi);
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        Main obj = new Main();
        obj.MainMenu();
    }

}
