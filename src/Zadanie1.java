public class Zadanie1 {
    public static void main(String[] args) {
        //generowanie tablicy
        int[] liczby = new int[1000];
        for(int i = 0; i < 1000; i++) {
            liczby[i] = i+1;
        }

        //wyswietalnie parzystych liczb
        /*for(int element : liczby) {
            if(element % 2 == 0) {
                System.out.println(element);
            }
        }*/

        for(int element : liczby) {
            System.out.print(element);
            if(element % 3 == 0) {
                System.out.print(" Fizz");
            }
            if(element % 5 == 0) {
                System.out.print(" Buzz");
            }
            System.out.println();
        }
    }
}
