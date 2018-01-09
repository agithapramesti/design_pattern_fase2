public class Main {
    public static void main(String[] args) {
        InterfaceBeasiswa beasiswa = new ImpBeasiswa();
        InterfaceBeasiswa beasiswa1 = new SetahunBeasiswaDecorator(new ImpBeasiswa());

        InterfaceBeasiswa beasiswaa = new ImpBeasiswa();
        InterfaceBeasiswa beasiswaa1 = new SebulanBeasiswaDecorator(new ImpBeasiswa());

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

    }
}
