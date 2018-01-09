public class Subscribe extends Observer {

    public Subscribe(ModelMahasiswa mahasiswa){
        this.mahasiswa=mahasiswa;
        this.mahasiswa.attach(this);
    }
    @Override
    public void update(){

        System.out.println("Hey "+mahasiswa.getNamaMahasiswa()+" anda berhasil Subscribe!");
    }
}