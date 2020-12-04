
package uts.if1.pkg10119032.ginanjartubagusgumilar.no2;
import java.util.Scanner;
/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program tabungan
 * menggunakan konsep objek
 */
public class UTSIF110119032GINANJARTUBAGUSGUMILARNo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal : ");
        Tabungan tabungan1 = new Tabungan(scan.nextInt());
        
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda Sekarang : " + tabungan1.ambilUang(scan.nextInt()));
    }
}