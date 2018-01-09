import java.util.ArrayList;
import java.util.List;

public class ModelMahasiswa {
    private int idMahasiswa, semester;
    private String namaMahasiswa, statusBeasiswa, statusMahasiswa, jurusan;
    private float ipk;
    private List<Observer> observers= new ArrayList<>();
    public ModelMahasiswa(){}
// status beasiswa buat yg memento
// status mahasiswa buat yg observer

    public ModelMahasiswa(int idMahasiswa, int semester, String namaMahasiswa, String statusBeasiswa, String statusMahasiswa, String jurusan, float ipk) {
        this.idMahasiswa = idMahasiswa;
        this.semester = semester;
        this.namaMahasiswa = namaMahasiswa;
        this.statusBeasiswa = statusBeasiswa;
        this.statusMahasiswa = statusMahasiswa;
        this.jurusan = jurusan;
        this.ipk = ipk;
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

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
}
