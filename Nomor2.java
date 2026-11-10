import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Angka Positif");
        } else if (angka < 0) {
            System.out.println("Angka Negatif");
        } else {
            System.out.println("Angka Nol");
        }
    }
}