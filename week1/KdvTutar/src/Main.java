import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fiyat girin: ");
        double fiyat = scanner.nextDouble();

        if(fiyat > 0 && fiyat < 1000){
            display(fiyat,18);
        }
        else if(fiyat >= 1000){
            display(fiyat,8);
        }
        else{
            throw new IllegalArgumentException("Fiyat negatif olamaz");
        }

    }

    private static void display(double tutar,int kdv){
        System.out.println("KDVsiz fiyat: " + tutar);
        System.out.println("KDVli fiyat: "+ (tutar*kdv/100+tutar));
        System.out.println("KDV tutar: " + tutar*kdv/100);
    }
}