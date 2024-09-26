package com;
import java.util.Arrays;

public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone dimatikan.");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("To: " + nomorTujuan + " , " + pesan);
    }

    public void kirimPesan(String nomorTujuan1, String nomorTujuan2, String pesan) {
        System.out.println("To: " + nomorTujuan1 + " & " + nomorTujuan2 + " , " + pesan);
    }

    public void kirimPesan(String[] daftarNomor, String pesan) {
        System.out.println("To (List): " + Arrays.toString(daftarNomor) + ", " + pesan); 
    }
}