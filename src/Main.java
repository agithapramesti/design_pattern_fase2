public class Main {
//int idMahasiswa, int semester, String namaMahasiswa, String statusBeasiswa, String statusMahasiswa, String jurusan, float ipk
    public static void main(String[] args) {


        Mahasiswa mahasiswa= new Mahasiswa(1,3,"gege","diterima","subscribe","TI",3);
        Mahasiswa mahasiswa2= new Mahasiswa(2,3,"nadya","diterima","unsubscribe","TI",3);
        new Subscribe(mahasiswa);
        new Unsubscribe(mahasiswa2);
        mahasiswa.setStatusMahasiswa(mahasiswa.getStatusMahasiswa());
        mahasiswa2.setStatusMahasiswa(mahasiswa2.getStatusMahasiswa());

        BeasiswaFactory beasiswaFactory= new BeasiswaFactory();
        Beasiswaa beasiswaa1= beasiswaFactory.getBeasiswa("bidikmisi");
        beasiswaa1.draw();
        Beasiswaa beasiswaa2= beasiswaFactory.getBeasiswa("akademis");
        beasiswaa2.draw();
    }
}
