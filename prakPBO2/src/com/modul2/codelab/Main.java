package com.modul2.codelab;

import com.modul2.codelab.Aritmatics.Pembagian;
import com.modul2.codelab.Aritmatics.Pengurangan;
import com.modul2.codelab.Aritmatics.Penjumlahan;
import com.modul2.codelab.Aritmatics.Perkalian;

public class Main {
    public static void main(String[] args) {
        Pembagian bagi = new Pembagian();
        System.out.println(bagi.operation(50,2));
        Pengurangan kurang = new Pengurangan();
        System.out.println(kurang.operation(40,10,10));
        Penjumlahan jumlah = new Penjumlahan();
        System.out.println(jumlah.operation(90,5,2));
        Perkalian kali = new Perkalian();
        System.out.println(kali.operation(1,6,4));
    }
}
