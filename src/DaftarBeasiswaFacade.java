import java.util.ArrayList;

public class DaftarBeasiswaFacade {
    private Mahasiswa mahasiswa;

    public DaftarBeasiswaFacade(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void daftar(ArrayList<Beasiswa> daftarBeasiswa, ArrayList<Pewawancara> daftarPewawancara) {
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