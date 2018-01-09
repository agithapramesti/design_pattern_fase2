package com.example.desaignPattern.model;

public class Mahasiswa {
    private int idMahasiswa, semester;
    private String namaMahasiswa, statusBeasiswa, status, jurusan ;
    private float ipk;

    public Mahasiswa(int idMahasiswa, int semester, String namaMahasiswa, String statusBeasiswa, String status, String jurusan, float ipk) {
        this.idMahasiswa = idMahasiswa;
        this.semester = semester;
        this.namaMahasiswa = namaMahasiswa;
        this.statusBeasiswa = statusBeasiswa;
        this.status = status;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public int getIdMahasiswa() {
        return idMahasiswa;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public void setIdMahasiswa(int idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getStatusBeasiswa() {
        return statusBeasiswa;
    }

    public void setStatusBeasiswa(String statusBeasiswa) {
        this.statusBeasiswa = statusBeasiswa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
