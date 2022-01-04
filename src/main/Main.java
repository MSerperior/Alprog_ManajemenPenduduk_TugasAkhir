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
        arr.display();
    }
}
