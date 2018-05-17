
public class Yakit {
    private String yakit;
    private int ID;

    public Yakit(String yakit) {
        this.yakit = yakit;
    }

    public Yakit(String yakit, int ID) {
        this.yakit = yakit;
        this.ID = ID;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    public Yakit() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
