public class KepalaKemahasiswaan implements InterfacePewawancara {
    private ModelPewawancara pewawancara;

    public KepalaKemahasiswaan(String nama, int id) {
        this.pewawancara = new ModelPewawancara(nama, id, "kondisi finansial");
    }

    @Override
    public void menanyakanPertanyaan() {
        this.pewawancara.menanyakanPertanyaan();
    }
}
