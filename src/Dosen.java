public class Dosen implements InterfacePewawancara {
    private ModelPewawancara pewawancara;

    public Dosen(String nama, int id) {
        this.pewawancara = new ModelPewawancara(nama, id, "kondisi akademis");
    }

    @Override
    public void menanyakanPertanyaan() {
        this.pewawancara.menanyakanPertanyaan();
    }
}