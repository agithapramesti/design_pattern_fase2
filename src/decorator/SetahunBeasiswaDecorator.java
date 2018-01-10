package decorator;

public class SetahunBeasiswaDecorator extends DecoratorBeasiswa{
    public SetahunBeasiswaDecorator(InterfaceBeasiswa beasiswa) {
        super(beasiswa);
    }

    @Override
    public void getBeasiswaName() {
        beasiswa.getBeasiswaName();
        setWaktu();
    }

    @Override
    public void draw() {

    }

    //  method waktu berbeda
    private void setWaktu(){
        System.out.println("Durasi : 1 tahun");
    }
}
