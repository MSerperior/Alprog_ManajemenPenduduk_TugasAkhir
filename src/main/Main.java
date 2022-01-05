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
        
        UniqueArray arr = new UniqueArray();
        Scanner input = new Scanner(System.in);
        int pilihMenu, pilih;
        System.out.println("Data Penduduk");
        System.out.print("=====MENU=====\n1. Tambah\n2. Edit\n3. Hapus\n4. Cari\n5. Tampil\n6. Exit\nPilih menu: ");
        pilihMenu = input.nextInt();

        while (pilihMenu!=6) {
            switch (pilihMenu) {
                case 1:
                    //tambah
                    System.out.print("///Tambah Data Penduduk///\nMasukan jumlah data: ");
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
                    System.out.print("/////Edit Data Penduduk/////\nMasukan NIK yang diedit: ");
                    int cari = input.nextInt();
                    arr.cari(cari);
                    System.out.println("-------------------------");
                    System.out.print("Yang akan di edit: \n1. NIK\n2. Nama\n3. Usia\nMasukan pilihan: ");
                    pilih = input.nextInt();
                    System.out.println("-------------------------");
                    switch (pilih) {
                        case 1:
                            System.out.print("Masukan NIK baru: ");
                            int nikBaru = input.nextInt();
                            arr.editNIK(cari, nikBaru);
                            arr.sort();
                            break;
                        case 2:
                            System.out.print("Masukan Nama baru: ");
                            String namaBaru = input.next();
                            arr.editNama(cari, namaBaru);
                            break;
                        case 3:
                            System.out.print("Masukan Usia baru: ");
                            int usiaBaru = input.nextInt();
                            arr.editUsia(cari, usiaBaru);
                            break;
                        default:
                            System.out.println("Input tidak valid!");
                            break;
                    }
                    break;
                case 3:
                    //hapus
                    //cek lagi ya
                    System.out.print("Masukkan NIK yang akan dihapus: ");                
                    pilih = input.nextInt();
                    arr.hapus(pilih);
                    break;
                case 4:
                    //cari
                    System.out.print("/////Cari Data Penduduk/////\nCari berdasarkan:\n1. NIK\n2. Nama\nMasukan pilihan: ");
                    pilih = input.nextInt();
                    System.out.println("-------------------------");
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
                            System.out.println("Input tidak valid!");
                            break;
                    }
                    System.out.println("-------------------------");
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
                    System.out.println("Input tidak valid!");
                    break;
            }

            System.out.print("\n=====MENU=====\n1. Tambah\n2. Edit\n3. Hapus\n4. Cari\n5. Tampil\n6. Exit\nPilih menu: ");
            pilihMenu = input.nextInt();
        }
    }
}
