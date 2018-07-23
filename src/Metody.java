import java.util.Random;

public class Metody {
    static final int MAX = 10;
    static int x;

    public static int[] reverseOrder(int tab[]) {
        int[] reversed = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            reversed[i] = tab[tab.length - 1 - i];
        }

        return reversed;
    }


    public static void random(int[] tab) {


        for (int i = 0; i < tab.length; i++) {
            Random rand = new Random();
            tab[i] = rand.nextInt(MAX);

        }

    }

    public static int tab2(int[] tab, int x) {
        int suma = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x)
                suma++;
        }

        return suma;
    }
}


