import java.util.Scanner;

public class Nomor2{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        String pilihan;
        double kodeBungaflow1= 50000;
        double kodeBungaflow2= 40000;
        double kodeBungaflow3= 30000;
        double biayaPelayanan1= 0.30;
        double biayaPelayanan2= 0.20;
        double biayaPelayanan3= 0.10;

        while (true) {
        System.out.print("Masukkan kode bungalow [1/2/3]: ");
        int kodeBungalow = input.nextInt();

        System.out.print("Lama menginap (malam): ");
        int lamaMenginap = input.nextInt();

        int harga= 0;
        switch (harga) {
            case 1:
                harga= 50000;
            case 2:
                harga= 40000;
            case 3:
                harga= 30000;
            }

        input.nextLine();
        System.out.print("Input lagi? (Y/N): ");
        pilihan = input.nextLine();
        if (pilihan.equalsIgnoreCase("N")) {
            break;
        }

        double biayaMenginap = lamaMenginap *tarif

    }
    }
}
        
