public class ModelPewawancara {
    private int idPewawancara;
    private String namaPewawancara, role, pertanyaan;

    public ModelPewawancara(String nama, int id, String kondisi_finansial){}

    public ModelPewawancara(int idPewawancara, String namaPewawancara, String role, String pertanyaan) {

        this.idPewawancara = idPewawancara;
        this.namaPewawancara = namaPewawancara;
        this.role = role;
        this.pertanyaan = pertanyaan;
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

    public void menanyakanPertanyaan() {
        System.out.println(this.namaPewawancara + " menanyakan tentang " + this.pertanyaan);
    }
}
