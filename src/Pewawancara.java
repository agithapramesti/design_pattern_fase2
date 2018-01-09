public class Pewawancara {
    private int idPewawancara;
    private String namaPewawancara;
    private String pertanyaan;

    public Pewawancara(){}

    public Pewawancara(int idPewawancara, String namaPewawancara, String role, String pertanyaan) {
        this.idPewawancara = idPewawancara;
        this.namaPewawancara = namaPewawancara;
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

    public void menanyakanPertanyaan() {
        System.out.println(this.namaPewawancara + " menanyakan tentang " + this.pertanyaan);
    }
}
