public class Unsubscribe extends Observer{
    public Unsubscribe(Mahasiswa mahasiswa) {
        this.mahasiswa=mahasiswa;
        this.mahasiswa.attach(this);
    }
    @Override
    public void update(){
        System.out.println(" anda unsubscribe.. ");
    }
}
