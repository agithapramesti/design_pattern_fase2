public class BeasiswaFactory {
    public InterfaceBeasiswa getBeasiswa(String jenisBeasiswa){
        if(jenisBeasiswa==null){
            return null;
        }
        if(jenisBeasiswa.equalsIgnoreCase("bidikmisi")){
            return new BeasiswaBidikmisi();
        }
        else if(jenisBeasiswa.equalsIgnoreCase("akademis")){
            return new BeasiswaAkademis();
        }
        return null;
    }
}