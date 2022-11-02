import java.util.Scanner;

public class Main {
    static final double PI_VAL = 3.14;
    public static void main(String[] args) {
        double r,aci;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter yaricap: ");
        r = scanner.nextDouble();

        System.out.print("Aci: ");
        aci = scanner.nextDouble();

        System.out.print("Dilimin alani: "+ (PI_VAL*(r*r)*aci)/360);

    }
}