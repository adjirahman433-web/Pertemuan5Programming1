import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka Genap");
        } else {
            System.out.println("Angka Ganjil");
        }

        input.close();
    }
}