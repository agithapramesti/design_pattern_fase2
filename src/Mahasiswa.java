

public class Mahasiswa {
    private int idMahasiswa, semester;
    private String namaMahasiswa, statusBeasiswa, statusMahasiswa, jurusan;
    private float ipk;

    public Mahasiswa(){}

    public Mahasiswa(int idMahasiswa, int semester, String namaMahasiswa, String statusBeasiswa, String statusMahasiswa, String jurusan, float ipk) {
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

    public Memento saveStateToMemento(){
        return new Memento(statusBeasiswa);
    }

    public void getStateFromMemento(Memento memento){
        statusBeasiswa = memento.getState();
    }
}
