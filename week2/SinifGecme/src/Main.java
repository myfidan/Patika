import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik not: ");
        mat = scanner.nextInt();

        System.out.print("Fizik not: ");
        fizik = scanner.nextInt();
        System.out.print("Turkce not: ");
        turkce = scanner.nextInt();
        System.out.print("Kimya not: ");
        kimya = scanner.nextInt();
        System.out.print("Muzik not: ");
        muzik = scanner.nextInt();

        double average = 0;
        int totalAvailable = 0;
        if (mat >= 0 && mat <= 100){
            average += mat;
            totalAvailable++;
        }
        if (fizik >= 0 && fizik <= 100){
            average += fizik;
            totalAvailable++;
        }
        if (turkce >= 0 && turkce <= 100){
            average += turkce;
            totalAvailable++;
        }
        if (kimya >= 0 && kimya <= 100){
            average += kimya;
            totalAvailable++;
        }
        if (muzik >= 0 && muzik <= 100){
            average += muzik;
            totalAvailable++;
        }
        if(totalAvailable != 0)
            average /= totalAvailable;
        else{
            System.out.println("Hesaplancak not yok !");
            return;
        }

        if(average <= 55){
            System.out.println("Sinifta kaldiniz. Average not: " + average);
        }
        else{
            System.out.println("Sinifi gectiniz. Average Not: " + average);
        }
    }
}