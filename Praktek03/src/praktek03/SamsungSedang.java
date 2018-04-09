package praktek03;
public class SamsungSedang extends Samsung {
    private String jenisSamsung;
    
    void throttle (){
        System.out.println("Welcome to Samsung S9");
    }

    public String getJenisSamsung() {
        return jenisSamsung;
    }

    public void setJenisSamsung(String jenisSamsung) {
        this.jenisSamsung = jenisSamsung;
    }
    
    
}
