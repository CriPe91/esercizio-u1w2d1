import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GestioneMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arrCasuale = new int[5];
        Random random = new Random();

        for (int i = 0; i < arrCasuale.length; i++) {


            arrCasuale[i] = random.nextInt(11);

        }
        System.out.println(Arrays.toString(arrCasuale));


        while (true) {

            System.out.println("Inserisci la posizione dove inserire il nuovo numero");
            int posizione = Integer.parseInt(sc.nextLine());

            if (posizione == 0) {
                System.out.println("FINE");
                sc.close();
                break;
            } else if (posizione <= arrCasuale.length) {
                System.out.println("Inserisci un numero");
                int numeroPosizione = Integer.parseInt(sc.nextLine());
                arrCasuale[posizione] = numeroPosizione;
                System.out.println(Arrays.toString(arrCasuale));
            }

        }
    }

}