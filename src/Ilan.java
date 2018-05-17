
import java.sql.Date;

public class Ilan {
    private int ID;
    private String ilanAdi;
    private int fiyat;
    private int km;
    private Date tarih;
    private int arabaID;
    private int sehirID;

    public Ilan() {
    }

    public Ilan(int ID, String ilanAdi, int fiyat, int km, Date tarih, int arabaID, int sehirID) {
        this.ID = ID;
        this.ilanAdi = ilanAdi;
        this.fiyat = fiyat;
        this.km = km;
        this.tarih = tarih;
        this.arabaID = arabaID;
        this.sehirID = sehirID;
    }
    
    

    public Ilan(int ID, String ilanAdi,Date tarih, int fiyat, int km) {
        this.ID = ID;
        this.ilanAdi = ilanAdi;
        this.fiyat = fiyat;
        this.km = km;
        this.tarih = tarih;
    }

    public Ilan(String ilanAdi, int fiyat, int km, Date tarih) {
        this.ilanAdi = ilanAdi;
        this.fiyat = fiyat;
        this.km = km;
        this.tarih = tarih;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIlanAdi() {
        return ilanAdi;
    }

    public void setIlanAdi(String ilanAdi) {
        this.ilanAdi = ilanAdi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public int getArabaID() {
        return arabaID;
    }

    public void setArabaID(int arabaID) {
        this.arabaID = arabaID;
    }

    public int getSehirID() {
        return sehirID;
    }

    public void setSehirID(int sehirID) {
        this.sehirID = sehirID;
    }
    
    
    
    
}
