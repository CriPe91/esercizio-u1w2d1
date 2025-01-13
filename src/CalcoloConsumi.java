import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalcoloConsumi {
    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger(CalcoloConsumi.class);
        Scanner sc = new Scanner(System.in);
        double km = 0;
        double litri = 0;

        while (true) {
//            System.out.println("inserisci i KM e i LITRI per calcolarne il consumo");
            log.info("inserisci i KM e i LITRI per calcolarne il consumo");
            try {
//                System.out.print("inserisci i Km: ");
                log.info("inserisci i Km: ");
                km = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
//                System.out.println(e.getMessage() + " " + " -->  inserisci il valore corretto per i Km.");
                log.error(" " + " -->  inserisci il valore corretto per i Km.");
            }

            try {
//                System.out.print("inserisci i Litri: ");
                log.info("inserisci i Litri: ");
                litri = Double.parseDouble(sc.nextLine());
                if (litri == 0) {
//                    System.out.println("impossibile dividere per zero");
                    log.info("impossibile dividere per zero");
                }
            } catch (NumberFormatException e) {
//                System.out.println(e.getMessage() + " " + " -->  inserisci il valore corretto per i litri.");
                log.error(" " + " -->  inserisci il valore corretto per i litri.");
            }
            double risultato = km / litri;
//            System.out.println("Il consumo è di: " + risultato + "km per litro");
            log.error("Il consumo è di: " + risultato + "km per litro");
        }
    }
}