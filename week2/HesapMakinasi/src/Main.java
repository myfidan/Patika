import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Number: ");
        n1 = scanner.nextInt();
        System.out.print("Second Number: ");
        n2 = scanner.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Choose: ");
        select = scanner.nextInt();

        /*
        1- add
        2- subs
        3- mult
        4- div
         */
        switch (select){
            case 1:
                System.out.println("Addition: " + (n1+n2));
                break;
            case 2:
                System.out.println("Subtraction: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Multiplication: " + (n1*n2));
                break;
            case 4:
                // if n2 is 0, this will throw an exception because of division by 0
                try{
                    System.out.println("Division: " + (n1/n2));
                }
                catch (Exception e){
                    System.out.println("Division by 0 error!");
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Invalid choose option");
        }

    }
}