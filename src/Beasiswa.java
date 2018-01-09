

public class Beasiswa {
    private int id;
    private String beasiswaName;
    private double totalBiaya;

    public Beasiswa(){}

    public Beasiswa(int id, String beasiswaName, double totalBiaya) {
        this.id = id;
        this.beasiswaName = beasiswaName;
        this.totalBiaya = totalBiaya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBeasiswaName() {
        return beasiswaName;
    }

    public void setBeasiswaName(String beasiswaName) {
        this.beasiswaName = beasiswaName;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }
}
