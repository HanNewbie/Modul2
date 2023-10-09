import java.util.Scanner;

public class TitikBeraksi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Titik T = new Titik();
        int pilih;

        do {
            System.out.println("Menu Operasi Titik:");
            System.out.println("1. Inisialisasi Titik");
            System.out.println("2. Tampil Titik");
            System.out.println("3. Perkalian Skalar Titik");
            System.out.println("4. Pencerminan terhadap Sumbu X");
            System.out.println("5. Pencerminan terhadap Sumbu Y");
            System.out.println("6. Jarak Antara Dua Titik");
            System.out.println("0. Keluar");
            System.out.print("MASUKKAN PILIHAN (1-6): ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nilai x: ");
                    int xInput = input.nextInt();
                    System.out.print("Masukkan nilai y: ");
                    int yInput = input.nextInt();
                    T.inisialisasiTitik(xInput, yInput);
                    break;
                case 2:
                    T.tampilTitik();
                    break;
                case 3:
                    System.out.print("Masukkan nilai skalar: ");
                    int skalar = input.nextInt();
                    T.perkalianSkalar(skalar);
                    System.out.println("Hasil Perkalian Skalar");
                    T.tampilTitik();
                    break;
                case 4:
                    T.pencerminanSumbuX();
                    System.out.println("Hasil pencerminan Sumbu X");
                    T.tampilTitik();
                    break;
                case 5:
                    T.pencerminanSumbuY();
                    System.out.println("Hasil pencerminan Sumbu Y");
                    T.tampilTitik();
                    break;
                case 6:
                    T.hitungJarak();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Null");
            }
        } while (pilih != 0);
    }
}
