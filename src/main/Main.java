/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author 62821
 */
public class Main {
    public static void main(String[] args) {
        System.err.println("Hello World");
        UniqueArray arr = new UniqueArray();
        
        arr.tambah(new Penduduk(4, "Dany", 18));
        arr.tambah(new Penduduk(6, "Ayu", 18));
        arr.tambah(new Penduduk(2, "Dicky", 18));
        arr.tambah(new Penduduk(10, "Yudi", 18));
        arr.tambah(new Penduduk(8, "Lafina", 18));
        arr.sort(); 
//        arr.display();
//        arr.cari(10);
        
        Scanner input = new Scanner(System.in);
        int pilihMenu;
        System.out.print("Data Penduduk\n1. Tambah\n2. Edit\n3. Hapus\n4. Cari\n5. Tampil\n6. Exit\nPilih menu: ");
        pilihMenu = input.nextInt();

        while (pilihMenu!=6) {
            switch (pilihMenu) {
                case 1:
                    //tambah
                    System.out.println("///Tambah Data Penduduk///");
                    System.out.print("Masukan jumlah data: ");
                    int jumlah = input.nextInt();
                    System.out.println("-------------------------");
                    for (int i = 0; i < jumlah; i++) {
                        System.out.print("Masukan NIK: ");
                        int nik = input.nextInt();
                        System.out.print("Masukan Nama: ");
                        String nama = input.next();
                        System.out.print("Masukan Usia: ");
                        int usia = input.nextInt();
                        arr.tambah(new Penduduk(nik, nama, usia));
                        System.out.println("-------------------------");
                    }
                    arr.sort();
                    break;
                case 2:
                    //edit
                    System.out.println("edit");

                    break;
                case 3:
                    //hapus
                    System.out.println("hapus");
                    break;
                case 4:
                    //cari
                    System.out.print("Cari berdasarkan:\n1. NIK\n2. Nama\nMasukan pilihan: ");
                    int pilih = input.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.print("Cari NIK: ");
                            int nik = input.nextInt();
                            arr.cari(nik);
                            break;
                        case 2: //data belom bisa tampil
                            System.out.print("Cari Nama: ");
                            String nama = input.next();
                            arr.cari(nama);
                            break;
                        default:
                            System.out.print("Input tidak valid!");
                            break;
                    }
                    break;
                case 5:
                    //tampil
                    arr.display();
                    break;
                case 6:
                    //exit
                    System.exit(0);
                    break;
                default:
                    System.out.print("Input tidak valid!");
                    break;
            }

            System.out.print("Data Penduduk\n1. Tambah\n2. Edit\n3. Hapus\n4. Cari\n5. Tampil\n6. Exit\nPilih menu: ");
            pilihMenu = input.nextInt();
        }
    }
}
