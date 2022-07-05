import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int basamakSayisi;

        System.out.print("Basamak sayisini giriniz : ");
        basamakSayisi = scan.nextInt();

        for (int i = basamakSayisi-1; i >= 0; i--) {
            for (int j = (basamakSayisi - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
