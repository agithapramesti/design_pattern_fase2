public class KepalaKemahasiswaan implements InterfacePewawancara {
    private Pewawancara pewawancara;

    public Dosen(String nama, int id) {
        this.pewawancara = new Pewawancara(nama, id, "kondisi finansial");
    }

    @Override
    public void menanyakanPertanyaan() {
        this.pewawancara.menanyakanPertanyaan();
    }
}
