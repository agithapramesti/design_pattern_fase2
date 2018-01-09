public class BeasiswaFactory {
    public Beasiswaa getBeasiswa(String jenisBeasiswa){
        if(jenisBeasiswa==null){
            return null;
        }
        if(jenisBeasiswa.equalsIgnoreCase("bidikmisi")){
            return new BeasiswaBidikMisi();
        }
        else if(jenisBeasiswa.equalsIgnoreCase("akademis")){
            return new BeasiswaAkademis();
        }
        return null;
    }
}
