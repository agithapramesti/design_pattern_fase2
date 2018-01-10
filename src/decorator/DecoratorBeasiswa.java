package decorator;

public abstract class DecoratorBeasiswa implements InterfaceBeasiswa {
    protected InterfaceBeasiswa beasiswa;

    public DecoratorBeasiswa(InterfaceBeasiswa beasiswa) {
        this.beasiswa = beasiswa;
    }

    @Override
    public void getBeasiswaName() {
        beasiswa.getBeasiswaName();
    }

    @Override
    public void getTotalBiaya() {
        beasiswa.getTotalBiaya();
    }
}
