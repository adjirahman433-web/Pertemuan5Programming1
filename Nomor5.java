import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        String operator = input.next();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        switch (operator) {
            case "+":
                System.out.println("Hasil: " + (angka1 + angka2));
                break;

            case "-":
                System.out.println("Hasil: " + (angka1 - angka2));
                break;

            case "*":
                System.out.println("Hasil: " + (angka1 * angka2));
                break;

            case "/":
                if (angka2 == 0) {
                    System.out.println("Tidak bisa dibagi nol");
                } else {
                    System.out.println("Hasil: " + (angka1 / angka2));
                }
                break;

            case "%":
                if (angka2 == 0) {
                    System.out.println("Tidak bisa dibagi nol");
                } else {
                    System.out.println("Hasil: " + (angka1 % angka2));
                }
                break;

            default:
                System.out.println("Operator tidak valid");
        }
    }
}