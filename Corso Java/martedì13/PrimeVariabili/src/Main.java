public class Main {
    public static void main(String[] args) {
        //provo variabili
        int provaNumero = 12;
        String provaTesto = "Ciao Mondo";
        boolean provaBool = true;
        final int provaNumero2 = 15;
        double myDouble = 19.99d;

        //concat stringhe
        String firstPart = "Ciao ";
        String lastPart = "Mondo";
        String fullPart = firstPart + lastPart;
        System.out.println(fullPart);

        int x = 5;
        int y = 6;
        int somma = x + y;
        System.out.println(x + y);
        System.out.println(somma);

        //refer
        int xx = 5, yy = 6, z = 50;
        System.out.println(xx + yy + z);

        ///dichiarazione a cascata
        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);

        //booleani true false
        boolean isJava = true; // 1
        boolean isFerrari = false; // 0

    }
}
