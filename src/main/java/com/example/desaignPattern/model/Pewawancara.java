package com.example.desaignPattern.model;

public class Pewawancara {
    private int idPewancara;
    private String namaPewawancara, role;
    public Pewawancara(){}
    public Pewawancara(int idPewancara, String namaPewawancara, String role) {
        this.idPewancara = idPewancara;
        this.namaPewawancara = namaPewawancara;
        this.role = role;
    }

    public int getIdPewancara() {
        return idPewancara;
    }

    public void setIdPewancara(int idPewancara) {
        this.idPewancara = idPewancara;
    }

    public String getNamaPewawancara() {
        return namaPewawancara;
    }

    public void setNamaPewawancara(String namaPewawancara) {
        this.namaPewawancara = namaPewawancara;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
