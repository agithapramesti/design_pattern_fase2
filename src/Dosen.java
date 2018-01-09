public class Dosen implements InterfacePewawancara {
    private Pewawancara pewawancara;

    public Dosen(String nama, int id) {
        this.pewawancara = new Pewawancara(nama, id, "kondisi akademis");
    }

    @Override
    public void menanyakanPertanyaan() {
        this.pewawancara.menanyakanPertanyaan();
    }
}