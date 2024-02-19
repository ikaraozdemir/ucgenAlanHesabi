import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişken tanımlama
        int a, b, c;
        // kullanıcıdan girdi alma
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        b = input.nextInt();
        System.out.print("Üçüncü kenarı giriniz: ");
        c = input.nextInt();

        // Alan hesabı
        double u, alan;
        u = (a + b + c)/2;
        alan = Math.sqrt( u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + alan);

    }
}