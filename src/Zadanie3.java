import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        //generowanie tablicy
        int[][] tab = new int[5][3];

        for(int row = 0; row < tab.length; row++) {
            for(int col = 0; col < tab[row].length; col++) {
                Random losowacz = new Random();
                tab[row][col] = losowacz.nextInt(0, 100);
                System.out.print(tab[row][col] + " ");
            }
            System.out.println();
        }

        double max = 0;
        for(int[] row : tab) {
            int sum = 0;
            for(int i = 0; i < row.length; i++) {
                sum = sum + row[i];
            }
            double avr = ((double) sum)/row.length;
            System.out.println(avr);
            if(max < avr) {
                max = avr;
            }
        }

        System.out.println("Max avr: " + max);

        /*double b = 5.0;
        int a = (int) b;*/
    }
}
