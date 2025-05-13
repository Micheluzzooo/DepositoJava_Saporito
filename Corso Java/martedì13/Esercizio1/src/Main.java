import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        System.out.println("Inserisci una stringa");
        String stringa = myObj.nextLine();
        System.out.println("Questa è una stringa: " + stringa);

        System.out.println("Inserisci un intero");
        int numero = myObj.nextInt();
        System.out.println("Questa è un intero: " + numero);

        System.out.println("Inserisci un float");
        float numero2 = myObj.nextFloat();
        System.out.println("Questa è un float: " + numero2);

        System.out.println("Inserisci un double");
        double numero3 = myObj.nextDouble();
        System.out.println("Questa è un double: " + numero3);

        System.out.println("Inserisci un boolean");
        boolean trueFalse = myObj.nextBoolean();
        System.out.println("Questa è un boolean: " + trueFalse);

    }
}