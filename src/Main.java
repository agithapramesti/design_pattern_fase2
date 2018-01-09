public class Main {
    public static void main(String[] args) {
        InterfaceBeasiswa beasiswa = new ImpBeasiswa();
        InterfaceBeasiswa beasiswa1 = new SetahunBeasiswaDecorator(new ImpBeasiswa());

        InterfaceBeasiswa beasiswaa = new ImpBeasiswa();
        InterfaceBeasiswa beasiswaa1 = new SebulanBeasiswaDecorator(new ImpBeasiswa());

//        Decorator
        System.out.println("==================================================");

        System.out.println("Decorator Implementation");
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
        System.out.println("\nObserver Implementation");
        ModelMahasiswa mahasiswa= new ModelMahasiswa(1,3,"gege","diterima","subscribe","TI",3);
        ModelMahasiswa mahasiswa2= new ModelMahasiswa(2,3,"nadya","diterima","unsubscribe","TI",3);
        new Subscribe(mahasiswa);
        new Unsubscribe(mahasiswa2);
        mahasiswa.setStatusMahasiswa(mahasiswa.getStatusMahasiswa());
        mahasiswa2.setStatusMahasiswa(mahasiswa2.getStatusMahasiswa());

        System.out.println("==================================================");
//        Factory
        System.out.println("\nFactory Implementation");
        BeasiswaFactory beasiswaFactory= new BeasiswaFactory();
        InterfaceBeasiswa beasiswaa11= beasiswaFactory.getBeasiswa("bidikmisi");
        beasiswaa11.draw();
        InterfaceBeasiswa beasiswaa2= beasiswaFactory.getBeasiswa("akademis");
        beasiswaa2.draw();

        System.out.println("==================================================");

    }
}
