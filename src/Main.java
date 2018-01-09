public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        InterfaceBeasiswa beasiswa = new ImpBeasiswaBidikmisi();
        InterfaceBeasiswa beasiswa1 = new SetahunBeasiswaDecorator(new ImpBeasiswaBidikmisi());

        InterfaceBeasiswa beasiswaa = new ImpBeasiswaBidikmisi();
        InterfaceBeasiswa beasiswaa2 = new SetahunBeasiswaDecorator(new ImpBeasiswaBlibli());
        System.out.println("\nPenerima beasiswa : ");
        beasiswa1.getBeasiswaName();
        System.out.println("Beasiswa yang didapatkan : ");
        beasiswa.getTotalBiaya();

        System.out.println("\nPenerima beasiswa : ");
        beasiswaa2.getBeasiswaName();
        System.out.println("Beasiswa yang didapatkan : ");
        beasiswaa.getTotalBiaya();
    }
}
