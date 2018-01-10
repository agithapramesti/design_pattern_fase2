import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ModelMahasiswa {
    private int idMahasiswa, semester;
    private String namaMahasiswa, statusBeasiswa, statusMahasiswa, jurusan;
    private double ipk;

    private ModelBeasiswa beasiswaPilihan;
    private Random randomGenerator;
    private List<Observer> observers= new ArrayList<>();
    public ModelMahasiswa(){}
// status beasiswa buat yg memento
// status mahasiswa buat yg observer

    public ModelMahasiswa(int idMahasiswa, int semester, String namaMahasiswa, String statusBeasiswa, String statusMahasiswa, String jurusan, double ipk) {
        this.randomGenerator = new Random();
        this.idMahasiswa = idMahasiswa;
        this.semester = semester;
        this.namaMahasiswa = namaMahasiswa;
        this.statusBeasiswa = statusBeasiswa;
        this.statusMahasiswa = statusMahasiswa;
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
    // status mahasiswa buat yg observer
    public String getStatusBeasiswa() {
        return statusBeasiswa;
    }

    public void setStatusBeasiswa(String statusBeasiswa) {

        this.statusBeasiswa = statusBeasiswa;

    }
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public String getStatusMahasiswa() {
        return statusMahasiswa;
    }

    public void setStatusMahasiswa(String statusMahasiswa) {

        this.statusMahasiswa = statusMahasiswa;
        notifyAllObservers();
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
    public Memento saveStateToMemento(){
        return new Memento(statusBeasiswa);
    }

    public void getStateFromMemento(Memento memento){
        statusBeasiswa = memento.getState();
    }
    public void pilihBeasiswa(List<ModelBeasiswa> daftarBeasiswa) throws Exception{
        int pilihan = randomGenerator.nextInt(daftarBeasiswa.size());
        this.beasiswaPilihan = daftarBeasiswa.get(pilihan);
        this.statusBeasiswa = "mendaftar beasiswa";
        System.out.println("Mahasiswa " + this.namaMahasiswa + " telah mendaftar beasiswa " + beasiswaPilihan.getBeasiswaName());
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

    public void wawancara(List<ModelPewawancara> daftarPewawancara) throws Exception{
        int pilihan = randomGenerator.nextInt(daftarPewawancara.size());
        ModelPewawancara pewawancara = daftarPewawancara.get(pilihan);
        System.out.println("Mahasiswa " + this.namaMahasiswa + " melakukan wawancara dengan " + pewawancara.getNamaPewawancara());
        this.statusBeasiswa = "melakukan wawancara";
        Thread.sleep(10);
    }

    public void mendapatkanHasil() throws Exception{
        String[] yesOrNo = {"yes", "no"};
        String hasil = yesOrNo[randomGenerator.nextInt(yesOrNo.length)];
        if(hasil.equals("yes")) {
            this.statusBeasiswa = "diterima " + this.beasiswaPilihan.getBeasiswaName();
            System.out.println("Mahasiswa " + this.namaMahasiswa + " mendapatkan beasiswa " + this.beasiswaPilihan.getBeasiswaName());
        }
        else {
            System.out.println("Mahasiswa " + this.namaMahasiswa + " mendapatkan beasiswa " + this.beasiswaPilihan.getBeasiswaName());
        }
    }
}
