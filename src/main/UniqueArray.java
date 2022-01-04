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
    int n= -1;

    /**
     * Menambah penduduk di indeks akhir
     *
     * @param p penduduk baru
     */
    public void tambah(Penduduk p) {
        this.penduduk[++n] = p;
    }
    /**
     * sorting menggunakan bubble sort
     */
    public void sort() {
        if (n == -1) {
            System.out.println("Data Kosong");
        } else {
            for (int i = 0; i <= n; i++) // Last i elements are already in place
            {
                for (int j = 0; j <= n - 1; j++) {
                    if (penduduk[j].compareTo(penduduk[j+1]) == 1) {
                        Penduduk tmp = penduduk[j];
                        penduduk[j] = penduduk[j+1];
                        penduduk[j+1] = tmp;
                    }
                }
            }
        }
    }
    public void display(){
        for(int i = 0; i <= n; i++){
            System.out.println(penduduk[i]);
        }
    }
}
