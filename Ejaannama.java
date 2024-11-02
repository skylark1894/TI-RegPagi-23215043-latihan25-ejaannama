/*
 * Nama:Moh.arif prasetyo
 * Nim : 23215043
 * Prodi : Teknik Informatika
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Ejaannama {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = scanner.nextLine();

        System.out.println("\nEjaan untuk \"" + nama + "\" adalah:");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }

        scanner.close();
    }
}
