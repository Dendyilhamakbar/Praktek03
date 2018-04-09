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
    }
}
