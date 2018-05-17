


public class Araba {
    private int ID;
    private String marka;
    private String model;
    private int vitesID;
    private int yakitID;
    private int renkID;

    public Araba(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Araba(int ID, String marka, String model, int vitesID, int yakitID, int renkID) {
        this.ID = ID;
        this.marka = marka;
        this.model = model;
        this.vitesID = vitesID;
        this.yakitID = yakitID;
        this.renkID = renkID;
    }

    public Araba(String marka) {
        this.marka = marka;
    }

    // yapıcı method
    
    public Araba() {
    }
    

    public Araba(int ID, String marka, String model) {
        this.ID = ID;
        this.marka = marka;
        this.model = model;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVitesID() {
        return vitesID;
    }

    public void setVitesID(int vitesID) {
        this.vitesID = vitesID;
    }

    public int getYakitID() {
        return yakitID;
    }

    public void setYakitID(int yakitID) {
        this.yakitID = yakitID;
    }

    public int getRenkID() {
        return renkID;
    }

    public void setRenkID(int renkID) {
        this.renkID = renkID;
    }
    
}
