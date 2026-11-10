import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        String grade;

        if (nilai >= 85 && nilai <= 100) {
            grade = "A";
        } else if (nilai >= 75) {
            grade = "B";
        } else if (nilai >= 65) {
            grade = "C";
        } else if (nilai >= 0) {
            grade = "D";
        } else {
            grade = "Nilai tidak valid";
        }

        String status = nilai >= 55 && nilai <= 100
                ? "Lulus" : "Tidak Lulus";

        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
    }
}