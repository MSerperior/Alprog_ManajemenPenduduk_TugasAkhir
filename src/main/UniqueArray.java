/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author 62821
 */
public class UniqueArray {

    Penduduk[] penduduk = new Penduduk[100];
    int n = -1;

    /**
     * Menambah penduduk di indeks akhir
     *
     * @param p penduduk baru
     */
    public void tambah(Penduduk p) {
        n += 1;
        this.penduduk[n] = p;
    }

    /**
     * sorting array penduduk menggunakan bubble sort
     */
    public void sort() {
        if (n == -1) {
            System.out.println("Data Kosong");
        } else {
            for (int i = 0; i <= n; i++)    {
                for (int j = 0; j <= n - 1; j++) {
                    if (penduduk[j].compareTo(penduduk[j + 1]) == 1) {
                        Penduduk tmp = penduduk[j];
                        penduduk[j] = penduduk[j + 1];
                        penduduk[j + 1] = tmp;
                    }
                }
            }
        }
    }
    /**
     * Print semua data
     */
    public void display() {
        for (int i = 0; i <= n; i++) {
            System.out.println(penduduk[i]);
        }
    }

    /**
     * Cari berdasarkan nik
     *
     * @param nik yang dicari
     */
    public void cari(int nik) {
        for (int i = 0; i <= n; i++) {
            if (penduduk[i].NIK == nik) {
                System.out.println(penduduk[i]);
            }
        }
    }
    /**
     * Cari berdasarkan nama
     * @param nama yang dicari
     */
    public void cari(String nama) {
        for (int i = 0; i <= n; i++) {
            if (penduduk[i].nama == nama) {
                System.out.println(penduduk[i]);
            }
        }
    }
}
