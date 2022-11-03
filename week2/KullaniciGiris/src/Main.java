import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,pass;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you username: ");
        username = scanner.nextLine();
        System.out.print("Enter you password: ");
        pass = scanner.nextLine();

        if(username.equals("patika") && pass.equals("java123"))
            System.out.println("Giris Yaptiniz!");
        else{
            System.out.print("Hatali giris, Sifrenizi yenilemek icin 1, yenilemek istemiyorsanız 0 basin: ");
            int choose = scanner.nextInt();
            if(choose == 1){
                System.out.print("Yeni sifrenizi giriniz, Sifre onceki sifreyle ayni olmamamilidir: ");
                scanner.nextLine();
                String newPass = scanner.nextLine();
                if(newPass.equals(pass))
                    System.out.println("Önceki sifreyle ayni giris.");
                else
                    System.out.println("Sifre Guncellendi");
            }
            else{
                System.out.println("Sifre sifirlamamayı sectiniz cikis yapiliyor.");
            }
        }
    }
}