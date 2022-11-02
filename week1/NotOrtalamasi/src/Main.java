import java.util.Scanner;

public class Main {
    //https://app.patika.dev/courses/java101/pratik-not-ortalamasi
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mat not: ");
        mat = scanner.nextInt();

        System.out.print("Fizik not: ");
        fizik = scanner.nextInt();

        System.out.print("Kimya not: ");
        kimya = scanner.nextInt();

        System.out.print("Turkce not: ");
        turkce = scanner.nextInt();

        System.out.print("Tarih not: ");
        tarih = scanner.nextInt();

        System.out.print("Muzik not: ");
        muzik = scanner.nextInt();

        double ort = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;

        System.out.println("Ortalama: " + ort);
        String s = ort > 60 ? "Sinifi gecti" :  "Sinifta kaldi";
        System.out.println(s);
    }
}