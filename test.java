import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int date;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Dogum Yilinizi Giriniz :");
        date = input.nextInt();

        if (date % 12 == 0) {
            System.out.println("Cin Zodyaginiz = Maymun");
        }
        if (date % 12 == 1) {
            System.out.println("Cin Zodyaginiz = Horoz");
        }
        if (date % 12 == 2) {
            System.out.println("Cin Zodyaginiz = Köpek");
        }
        if (date % 12 == 3) {
            System.out.println("Cin Zodyaginiz = Domuz");
        }
        if (date % 12 == 4) {
            System.out.println("Cin Zodyaginiz = Fare");
        }
        if (date % 12 == 5) {
            System.out.println("Cin Zodyaginiz = Öküz");
        }
        if (date % 12 == 6) {
            System.out.println("Cin Zodyaginiz = Kaplan");
        }
        if (date % 12 == 7) {
            System.out.println("Cin Zodyaginiz = Tavşan");
        }
        if (date % 12 == 8) {
            System.out.println("Cin Zodyaginiz = Ejderya");
        }
        if (date % 12 == 9) {
            System.out.println("Cin Zodyaginiz = Yılan");
        }
        if (date % 12 == 10) {
            System.out.println("Cin Zodyaginiz = At");
        }
        if (date % 12 == 11) {
            System.out.println("Cin Zodyaginiz = Koyun");
        }

    }
}
