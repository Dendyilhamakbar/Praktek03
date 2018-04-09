package praktek03;

public class Samsungaksi {
     public static void main(String[] args) {
        Samsung s =  new Samsung();
        
        s.setMerk("Samsung");
        s.setWarna("Rose Gold");
        s.setHarga(15000);
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
        SamsungMahal sm = new SamsungMahal();
        sm.setMerk("S9");
        sm.setWarna("RoseGold");
        sm.setHarga(15000);
        sm.setJenisSamsung("Series S");
        sm.cetakInfo();
        System.out.println("Jenis :"+sm.getJenisSamsung());
        sm.throttle();
     }
}
