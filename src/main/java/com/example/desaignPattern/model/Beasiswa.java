package com.example.desaignPattern.model;

public class Beasiswa {
    private int id;
    private String namaBeasiswa;
    private double totalBeasiswa;

    public Beasiswa(int id, String namaBeasiswa, double totalBeasiswa) {
        this.id = id;
        this.namaBeasiswa = namaBeasiswa;
        this.totalBeasiswa = totalBeasiswa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaBeasiswa() {
        return namaBeasiswa;
    }

    public void setNamaBeasiswa(String namaBeasiswa) {
        this.namaBeasiswa = namaBeasiswa;
    }

    public double getTotalBeasiswa() {
        return totalBeasiswa;
    }

    public void setTotalBeasiswa(double totalBeasiswa) {
        this.totalBeasiswa = totalBeasiswa;
    }
}
