package content;

import java.util.Scanner;

public class ASUW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        gitar gtr = new gitar();
        gitarelektrik gel = new gitarelektrik();
        customer pembeli = new customer();
        employee karyawan = new employee();
        kasiran ksr = new kasiran();
        Voucher pocer = new Voucher();
        int belanja;

        gtr.cort();
        gel.yahama();

        System.out.println("================================");
        System.out.println("Siapa diri anda?");
        System.out.println("1. Karyawan\n2.Pelanggan\n3.Logout");
        System.out.println("Masukkan Pilihan : ");
        belanja = input.nextInt();
        if (belanja == 1) {
            System.out.println("Karyawan");
            System.out.println("Masukkan Nama Anda");
            pembeli.setNama(input.next());
            pembeli.ismember();
            pembeli.setTipemember("Karyawan");
            System.out.println("Nama : " + pembeli.getNama());
            System.out.println("Membership : " + pembeli.getTipemember());
            System.out.println("Anda mendapatkan potongan harga");
            System.out.println((float) (karyawan.getdiskonkar() * 100));

        } else {
            System.out.println("Pelanggan");
            System.out.println("Masukkan Nama anda : ");
            pembeli.setNama(input.next());
            pembeli.ismember();
            if (pembeli.ismember() == Boolean.TRUE) {
                System.out.println("Nama anda : " + pembeli.getNama());
                System.out.println("Membership : " + pembeli.getTipemember());
                System.out.println("Anda mendapatkan potongan harga");
                System.out.println((int) pembeli.getdiskonmember() * 100);
            } else {
                System.out.println("Nama anda : " + pembeli.getNama());
                System.out.println("Anda bukan member");
                System.out.println((int) pembeli.getdiskonmember() * 100);
                pembeli.setTipemember("bukan");
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("List barang : ");
        System.out.println("1. Gitar");
        System.out.println("Merk : " + gtr.getMerk());
        System.out.println("Model : " + gtr.getModel());
        System.out.println("Harga : " + gtr.getHarga());
        System.out.println("Status : " + gtr.getKet());
        System.out.println("Diskon : " + gtr.getDiskon() * 100);
        System.out.println("---------------------------------------");
        System.out.println("2. Gitar Elektrik");
        System.out.println("Merk :" + gel.getMerk());
        System.out.println("Model : " + gel.getModel());
        System.out.println("Harga : " + gel.getHarga());
        System.out.println("Status : " + gel.getKet());
        System.out.println("Diskon: " + gel.getDiskon() * 100);
        System.out.println("----------------------------------------");
        System.out.println("Masukkan Pilihan : ");
        int pilih = input.nextInt();
        System.out.println("Masukkan kode voucher : ");
        String kode = input.next();
        if (pocer.isValid()) {
            ksr.kodevoucher(kode);

        }
        System.out.println("==================================");
        switch (pilih) {
            case 1:
                ksr.addharga(gtr.diskonakhir());
            case 2:
                ksr.addharga(gel.diskonakhir());
            default:
                break;
        }

        if (belanja == 2) {
            ksr.adddiskon(pembeli.getdiskonmember());
        } else {
            ksr.adddiskon(karyawan.getdiskonkar());
        }

        System.out.println("=====================");
        System.out.println("Nama pembeli :" + pembeli.getNama());
        System.out.println("Membership :" + pembeli.tipemember);
        if (pilih == 1) {
            System.out.println("Anda beli gitar");
        } else {
            System.out.println("Anda beli gitar elektrik");
        }
        System.out.println("Total harga : " + ksr.getTotal());
        System.out.println("Masukkan Uang anda : ");
        double uang = input.nextDouble();
        double kembalian = uang - ksr.getTotal();
        System.out.println("Kembalian : " + kembalian);

    }
}