import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        /*Random losowacz = new Random();
        int wylosowanaLiczba = losowacz.nextInt(0,101);
        System.out.println(wylosowanaLiczba);*/

        //generowanie tablicy
        int[] tab = new int[10];
        for (int i = 0; i < 10; i++) {
            Random losowacz = new Random();
            tab[i] = losowacz.nextInt(0,101);
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        //szukanie najmniejszej liczby
        int min;
        int secondMin;
        if(tab[0] > tab[1]) {
            min = tab[1];
            secondMin = tab[0];
        } else {
            min = tab[0];
            secondMin = tab[1];
        }

        for(int i = 2; i < 10; i++) {
            if(min > tab[i]) {
                secondMin = min;
                min = tab[i];
            } else if(secondMin > tab[i]) {
                secondMin = tab[i];
            }
        }

        System.out.println(min);
        System.out.println(secondMin);
    }
}
