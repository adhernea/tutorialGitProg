import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
        System.out.println("Introduce un número:");
        String number = SCANNER.nextLine();
        System.out.println("Hola Mundo " + number + "!");
        SCANNER.close();
    }

}