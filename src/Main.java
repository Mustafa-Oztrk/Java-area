import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CoddeLord Java Alan Hesaplama \n ");

        System.out.println("Ilk kenarı Giriniz");
        double akenar = scanner.nextDouble();

        System.out.println("Ikinci kenarı giriniz");
        double bKenar = scanner.nextDouble();

        double alan= akenar * bKenar;
        System.out.println("Girilen Şeklin alanı : " + alan);

    }
}