import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama: ");
        int sisi1 = input.nextInt();

        System.out.print("Masukkan sisi kedua: ");
        int sisi2 = input.nextInt();

        System.out.print("Masukkan sisi ketiga: ");
        int sisi3 = input.nextInt();

        if (sisi1 <= 0 || sisi2 <= 0 || sisi3 <= 0) {
            System.out.println("Bukan Segitiga");

        } else if (sisi1 + sisi2 <= sisi3 ||
                   sisi1 + sisi3 <= sisi2 ||
                   sisi2 + sisi3 <= sisi1) {
            System.out.println("Bukan Segitiga");

        } else if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Segitiga Sama Sisi");

        } else if (sisi1 == sisi2 ||
                   sisi1 == sisi3 ||
                   sisi2 == sisi3) {
            System.out.println("Segitiga Sama Kaki");

        } else {
            System.out.println("Segitiga Sembarang");
        }
    }
}