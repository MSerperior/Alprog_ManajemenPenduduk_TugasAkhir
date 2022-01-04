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
public class Penduduk {

    int NIK;
    int usia;
    String nama;

    Penduduk(int NIK, String nama, int usia) {
        this.NIK = NIK;
        this.nama = nama;
        this.usia = usia;
    }

    /**
     * Membandingkan object this dengan p
     *
     * @param p penduduk yang akan dibandingkan
     * @return -1 jika NIK this lebih kecil dari p, 0 jika sama, 1 jika lebih
     * besar dari p
     */
    public int compareTo(Penduduk p) {
        if (this.NIK < p.NIK) {
            return -1;
        } else if (this.NIK == p.NIK) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return String.format("NIK : %d, Nama : %s, Usia : %d", this.NIK, this.nama, this.usia);
    }
}
