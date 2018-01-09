import java.util.ArrayList;
import java.util.Observer;
import java.util.Random;

public class Mahasiswa implements Observer{
    private int idMahasiswa, semester;
    private String namaMahasiswa, statusBeasiswa, statusMahasiswa, jurusan;
    private float ipk;
    private Beasiswa beasiswaPilihan;
    private Random randomGenerator;

    public Mahasiswa(){}

    public Mahasiswa(int idMahasiswa, int semester, String namaMahasiswa, String jurusan, float ipk) {
        this.idMahasiswa = idMahasiswa;
        this.semester = semester;
        this.namaMahasiswa = namaMahasiswa;
        this.statusBeasiswa = "belum terdaftar";
        this.statusMahasiswa = "unsubscribe";
        this.jurusan = jurusan;
        this.ipk = ipk;
        this.beasiswaPilihan = null;
    }

    public int getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(int idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getStatusBeasiswa() {
        return statusBeasiswa;
    }

    public void setStatusBeasiswa(String statusBeasiswa) {
        this.statusBeasiswa = statusBeasiswa;
    }

    public String getStatusMahasiswa() {
        return statusMahasiswa;
    }

    public void setStatusMahasiswa(String statusMahasiswa) {
        this.statusMahasiswa = statusMahasiswa;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public void pilihBeasiswa(ArrayList<Beasiswa> daftarBeasiswa) throws Exception{
        int pilihan = randomGenerator.nextInt(daftarBeasiswa.size());
        this.beasiswaPilihan = daftarBeasiswa.get(pilihan);
        this.statusBeasiswa = "mendaftar beasiswa";
        System.out.println("Mahasiswa " + this.namaMahasiswa + " telah mendaftar beasiswa" + beasiswaPilihan.getBeasiswaName());
        Thread.sleep(10);
    }

    public void isiFormulir() throws Exception{
        System.out.println("Mahasiswa " + this.namaMahasiswa + " sedang mengisi formulir");
        Thread.sleep(10);
    }

    public void mengumpulkanBerkas() throws Exception{
        System.out.println("Mahasiswa " + this.namaMahasiswa + " mengumpulkan berkas");
        this.statusBeasiswa = "mengumpulkan berkas";
        Thread.sleep(10);
    }

    public void wawancara(ArrayList<Pewawancara> daftarPewawancara) throws Exception{
        int pilihan = randomGenerator.nextInt(daftarPewawancara.size());
        Pewawancara pewawancara = daftarPewawancara.get(pilihan);
        System.out.println("Mahasiswa " + this.namaMahasiswa + " melakukan wawancara dengan " + pewawancara.getNamaPewawancara());
        this.statusBeasiswa = "melakukan wawancara";
        Thread.sleep(10);
    }

    public void mendapatkanHasil() throws Exception{
        String[] yesOrNo = {"yes", "no"};
        String hasil = yesOrNo[randomGenerator.nextInt(yesOrNo.length)];
        if(hasil.equals("yes")) {
            this.statusBeasiswa = "diterima " + this.beasiswaPilihan.getBeasiswaName();
            System.out.println("Mahasiswa " + this.namaMahasiswa + " mendapatkan beasiswa " + this.beasiswaPilihan);
        }
        else {
            System.out.println("Mahasiswa " + this.namaMahasiswa + " mendapatkan beasiswa " + this.beasiswaPilihan);
        }
    }
}