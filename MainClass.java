// Main Class

public class MainClass {
    public static void main(String[] args) {
        
        //hitung luas, keliling, dan simetri dari suatu lingkaran A dg r=19 satuan
        Lingkaran A = new Lingkaran();
        A.jejari = 19;
        A.tampilHasil();

        System.out.println("");
        //Hitung luas
        PersegiPanjang B = new PersegiPanjang();
        B.panjang = 10;
        B.lebar = 5;
        B.tampilHasil();

        System.out.println("");
        
        Segitiga C = new Segitiga();
        C.alas = 12;
        C.tinggi = 8;
        C.tampilHasil();

        System.out.println("");
        Trapesium D = new Trapesium();
        D.sia = 12;
        D.sib = 8;
        D.tinggi = 5;
        D.tampilHasil();
    }
}