public class ModelPewawancara {
    private int idPewawancara;
    private String namaPewawancara, role;

    public ModelPewawancara(){}

    public ModelPewawancara(int idPewawancara, String namaPewawancara, String role) {
        this.idPewawancara = idPewawancara;
        this.namaPewawancara = namaPewawancara;
        this.role = role;
    }

    public int getIdPewawancara() {
        return idPewawancara;
    }

    public void setIdPewawancara(int idPewawancara) {
        this.idPewawancara = idPewawancara;
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
