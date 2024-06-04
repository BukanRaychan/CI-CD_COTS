package com.mycompany.kunjawsayah;

import static org.junit.Assert.*;

public class KubusTest {

    private Kubus kubus = new Kubus(5, "kiub");

    @org.junit.Test
    public void hitungLuasPermukaan() {
        assertEquals(150.0, kubus.hitungLuasPermukaan(), 0);
    }

    @org.junit.Test
    public void hitungVolume() {
        assertEquals(125.0, kubus.hitungVolume(), 0);
    }
}