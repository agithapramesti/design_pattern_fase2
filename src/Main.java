import decorator.ImpBeasiswa;
import decorator.InterfaceBeasiswa;
import decorator.SebulanBeasiswaDecorator;
import decorator.SetahunBeasiswaDecorator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        InterfaceBeasiswa beasiswa = new ImpBeasiswa();
        InterfaceBeasiswa beasiswa1 = new SetahunBeasiswaDecorator(new ImpBeasiswa());

        InterfaceBeasiswa beasiswaa = new ImpBeasiswa();
        InterfaceBeasiswa beasiswaa1 = new SebulanBeasiswaDecorator(new ImpBeasiswa());

        List<ModelBeasiswa> daftarBeasiswa= new ArrayList<ModelBeasiswa>();
        List<ModelPewawancara> daftarPewawancara= new ArrayList<ModelPewawancara>();

//        Abstract Factory
        System.out.println("==================================================");


        System.out.println("\nAbstract Factory Implementation\n");

        Dosen pakHarry = new Dosen("Harry Santoso", 123);
        pakHarry.menanyakanPertanyaan();

//      Factory
        System.out.println("==================================================");

        System.out.println("\nFactory Implementation \n");
        BeasiswaFactory beasiswaFactory= new BeasiswaFactory();
        InterfaceBeasiswa beasiswaa11= beasiswaFactory.getBeasiswa("bidikmisi");
        beasiswaa11.draw();
        InterfaceBeasiswa beasiswaa2= beasiswaFactory.getBeasiswa("akademis");
        beasiswaa2.draw();

//        Facade
        System.out.println("==================================================");

        System.out.println("\nFacade Implementation\n");

        ModelBeasiswa beasiswaBlibli = new ModelBeasiswa(1, "Beasiswa Blibli", 700000);
        ModelBeasiswa beasiswaJogja = new ModelBeasiswa(2, "Beasiswa Jogja", 900000);
        daftarBeasiswa.add(beasiswaBlibli);
        daftarBeasiswa.add(beasiswaJogja);
        ModelPewawancara pakBudi = new ModelPewawancara(1, "Budi Hartanto", "dosen", "asal dari mana");
        daftarPewawancara.add(pakBudi);

        ModelMahasiswa mhs1 = new ModelMahasiswa(123, 5, "Fira", "Belum Terdaftar", "Unsubscribed","Ilmu Komputer", 3.67);
        DaftarBeasiswaFacade fira = new DaftarBeasiswaFacade(mhs1);
        fira.daftar(daftarBeasiswa, daftarPewawancara);

//        Decorator
        System.out.println("==================================================");

        System.out.println("Decorator Implementation \n");
        System.out.println("Tahun 2015");
        System.out.println("Penerima beasiswa : ");
        beasiswa1.getBeasiswaName();
        System.out.println("Beasiswa yang didapatkan : ");
        beasiswa.getTotalBiaya();

        System.out.println("\nTahun 2015");
        System.out.println("Penerima beasiswa : ");
        beasiswaa1.getBeasiswaName();
        System.out.println("Beasiswa yang didapatkan : ");
        beasiswaa.getTotalBiaya();

        System.out.println("==================================================");

//        Observer
        System.out.println("\nObserver Implementation \n");
        ModelMahasiswa mahasiswa= new ModelMahasiswa(1,3,"gege","diterima","subscribe","TI",3);
        ModelMahasiswa mahasiswa2= new ModelMahasiswa(2,3,"nadya","diterima","unsubscribe","TI",3);
        ModelMahasiswa mahasiswa3= new ModelMahasiswa(3,5,"fay","diterima","unsubscribe","TI",3);

        new Subscribe(mahasiswa);
        new Subscribe(mahasiswa3);
        new Unsubscribe(mahasiswa2);
        mahasiswa.setStatusMahasiswa(mahasiswa.getStatusMahasiswa());
        mahasiswa2.setStatusMahasiswa(mahasiswa2.getStatusMahasiswa());


        System.out.println("==================================================");
//        memento
        System.out.println("\nMemento Implementation \n");
        List<ModelMahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new ModelMahasiswa(1, 2, "Fayya", "", "", "Ilmu Komputer", 5));
        mahasiswaList.add(new ModelMahasiswa(1, 2, "Githa", "", "", "Pendidikan Kedokteran", 5));
        mahasiswaList.add(new ModelMahasiswa(1, 2, "Nadya", "", "", "Sastra Java", 5));

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

        System.out.println("==================================================");

    }
}
