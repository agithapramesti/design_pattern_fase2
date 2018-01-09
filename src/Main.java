import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa(1, 2, "Fayya", "", "", "Ilmu Komputer", 5));
        mahasiswaList.add(new Mahasiswa(1, 2, "Githa", "", "", "Pendidikan Kedokteran", 5));
        mahasiswaList.add(new Mahasiswa(1, 2, "Nadya", "", "", "Sastra Java", 5));

        //Mahasiswa Fayya
        MementoCareTaker careTakerFayya = new MementoCareTaker();
        mahasiswaList.get(0).setStatusBeasiswa("Mendaftar Beasiswa");
        careTakerFayya.add(mahasiswaList.get(0).saveStateToMemento());
        mahasiswaList.get(0).setStatusBeasiswa("Mengumpulkan Berkas");
        careTakerFayya.add(mahasiswaList.get(0).saveStateToMemento());
        System.out.println("Current State Mahasiswa Fayya: " + mahasiswaList.get(0).getStatusBeasiswa());

        //Mahasiswa Githa
        MementoCareTaker careTakerGitha = new MementoCareTaker();
        mahasiswaList.get(1).setStatusBeasiswa("Mendaftar Beasiswa");
        careTakerGitha.add(mahasiswaList.get(1).saveStateToMemento());
        System.out.println("Current State Mahasiswa Githa: " + mahasiswaList.get(1).getStatusBeasiswa());

        //Mahasiswa Nadya
        MementoCareTaker careTakerNadya = new MementoCareTaker();
        mahasiswaList.get(2).setStatusBeasiswa("Mendaftar Beasiswa");
        careTakerNadya.add(mahasiswaList.get(2).saveStateToMemento());
        mahasiswaList.get(2).setStatusBeasiswa("Mengumpulkan Berkas");
        careTakerNadya.add(mahasiswaList.get(2).saveStateToMemento());
        mahasiswaList.get(2).setStatusBeasiswa("Melakukan Wawancara");
        careTakerNadya.add(mahasiswaList.get(2).saveStateToMemento());
        mahasiswaList.get(2).setStatusBeasiswa("Diterima");
        careTakerNadya.add(mahasiswaList.get(2).saveStateToMemento());
        System.out.println("Current State Mahasiswa Nadya: " + mahasiswaList.get(2).getStatusBeasiswa() + "\n");

        //History Memento Mahasiswa Nadya
        System.out.println("Memento History Nadya:");
        mahasiswaList.get(2).getStateFromMemento(careTakerNadya.get(0));
        System.out.println("First saved State Mahasiswa Nadya: " + mahasiswaList.get(2).getStatusBeasiswa());
        mahasiswaList.get(2).getStateFromMemento(careTakerNadya.get(1));
        System.out.println("Second saved State Mahasiswa Nadya: " + mahasiswaList.get(2).getStatusBeasiswa());
        mahasiswaList.get(2).getStateFromMemento(careTakerNadya.get(2));
        System.out.println("Third saved State Mahasiswa Nadya: " + mahasiswaList.get(2).getStatusBeasiswa());
        mahasiswaList.get(2).getStateFromMemento(careTakerNadya.get(3));
        System.out.println("Last saved State Mahasiswa Nadya: " + mahasiswaList.get(2).getStatusBeasiswa());


    }
}
