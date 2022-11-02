import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kenar 1: ");
        a = scanner.nextInt();
        System.out.print("Kenar 2: ");
        b = scanner.nextInt();

        System.out.println("Hiponetus: " + Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));

        System.out.println("Ucgen Cevre icin 3 kenari girin..");
        int k1,k2,k3;
        System.out.print("Kenar 1: ");
        k1 = scanner.nextInt();
        System.out.print("Kenar 2: ");
        k2 = scanner.nextInt();
        System.out.print("Kenar 3: ");
        k3 = scanner.nextInt();

        System.out.print("Ucgen Alan: ");
        double u = (k1+k2+k3)/2;
        double alan = Math.sqrt(u*(u-k1)*(u-k2)*(u-k3));
        System.out.print(alan);
    }
}