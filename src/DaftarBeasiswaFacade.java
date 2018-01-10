import java.util.ArrayList;
import java.util.List;

public class DaftarBeasiswaFacade {
    private ModelMahasiswa mahasiswa;

    public DaftarBeasiswaFacade(ModelMahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void daftar(List<ModelBeasiswa> daftarBeasiswa, List<ModelPewawancara> daftarPewawancara) throws Exception {
        mahasiswa.pilihBeasiswa(daftarBeasiswa);
        mahasiswa.isiFormulir();
        mahasiswa.mengumpulkanBerkas();
        mahasiswa.wawancara(daftarPewawancara);
        mahasiswa.mendapatkanHasil();
    }

    public void subscribe() {
        mahasiswa.setStatusMahasiswa("subscribe");
        new Subscribe(this.mahasiswa);
    }
}