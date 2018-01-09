public class SetahunBeasiswaDecorator extends DecoratorBeasiswa{
    public SetahunBeasiswaDecorator(InterfaceBeasiswa beasiswa) {
        super(beasiswa);
    }

    @Override
    public void getBeasiswaName() {
        beasiswa.getBeasiswaName();
        setWaktu(beasiswa);
    }

    private void setWaktu(InterfaceBeasiswa beasiswa){
        System.out.println("Durasi : 1 tahun");
    }
}
