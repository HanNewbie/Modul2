import java.util.Scanner;

public class Titik {
    private int x;
    private int y;

    //Default konstruktor
    public Titik() {
        this.x = 0;
        this.y = 0;
    }
    public void  inisialisasiTitik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void tampilTitik(){
        System.out.println("Titik: "+"X "+x +" "+"Y "+ y );
    }

    // Method untuk melakukan pencerminan Titik terhadap sumbu X
    public double pencerminanSumbuX(){
        y = -y;
        return y;
    }

    // Method untuk melakukan pencerminan Titik terhadap sumbu Y
    public double pencerminanSumbuY(){
        x = -x;
        return x;
    }

    // Method untuk mengalikan nilai Titik dengan suatu nilai skalar
    public double perkalianSkalar(int skalar){
        x *= skalar;
        y *= skalar;
        return skalar;
    }

    //Method untuk mencari jarak antara 2 titik.
    public double hitungJarak() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan koordinat x1: ");
        double x1 = input.nextDouble();

        System.out.print("Masukkan koordinat y1: ");
        double y1 = input.nextDouble();

        System.out.print("Masukkan koordinat x2: ");
        double x2 = input.nextDouble();

        System.out.print("Masukkan koordinat y2: ");
        double y2 = input.nextDouble();

        double jarak = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Jarak antara dua titik: " + jarak);

        return jarak;
        }
}
