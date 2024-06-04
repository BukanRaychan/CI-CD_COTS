/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kunjawsayah;

/**
 *
 * @author Raychan
 */
public class Kunjawsayah {

    public static void main(String[] args) {
        PrimaSegi3 PS3 = new PrimaSegi3("Traienggel Prism", 6, 7, 10);
        PS3.info();
        System.out.printf("%-25s : %.1f \n", "Luas Permukaan", PS3.hitungLuasPermukaan());
        System.out.printf("%-25s : %s \n", "Volume", PS3.hitungVolume());
        System.out.printf("%-25s : %s \n", "Volume", PS3.hitungVolume());
        System.out.printf("%-25s : %s \n", "Volume", PS3.hitungVolume());
        System.out.printf("%-25s : %s \n", "Volume", PS3.hitungVolume());
        System.out.printf("%-25s : %s \n", "Volume", PS3.hitungVolume());
        System.out.printf("%-25s : %s \n", "Volume", PS3.hitungVolume());
    }
}
