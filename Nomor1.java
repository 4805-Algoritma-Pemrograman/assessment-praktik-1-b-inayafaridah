import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double penjualan= 0;
        double komisi;
        double komisiPertama;
        double totalKomisi;

        System.out.print("Masukkan total penjualan: ");
        double totalPenjualan = input.nextDouble();
    
        if (penjualan == 500000) {
            totalKomisi = totalPenjualan * 0.10;
        } else if (penjualan >= 500000) {
            komisiPertama = 500000 * 0.10;
            komisi = (totalPenjualan - 500000) * 0.15;
            totalKomisi = komisiPertama + komisi;
        } else {
            totalKomisi = 0.0;
        }
        
        System.out.println("Komisi yang didapatkan: "+ totalKomisi);
        input.close();
    }
}
