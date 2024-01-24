public class Trapesium extends BangunDatar {
 //atribut
 public int tinggi;
 public int sia;
 public int sib;
 

 //methods
 @Override
 public double hitungLuas() {
     return ((sia + sib) * tinggi) / 2.0 ;
 }
 
 
 @Override
 public void tampilHasil() {
     System.out.println("Trapesium");
     System.out.println("--------");
     System.out.println("Luasnya : " + this.hitungLuas());
 }   
}
