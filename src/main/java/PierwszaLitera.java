import java.util.Scanner;

public class PierwszaLitera {

    public static String getVal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą literę koloru");
        String val = scanner.next();
        return val;
    }

    public static void main(String[] args) {
        String letter = getVal();

        switch (letter) {
            case "Z":
                System.out.println("Zielony");
                break;
            case "C":
                System.out.println("Czerwony");
                break;
            case "N":
                System.out.println("Niebieski");
                break;
            case "P":
                System.out.println("Pomarańczowy");
                break;
            default:
                System.out.println("Wprowadź inną literę");
        }
    }
}