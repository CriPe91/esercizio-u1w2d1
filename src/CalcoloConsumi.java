import java.util.Scanner;

public class CalcoloConsumi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            while(true) {
                System.out.println("Calcola il consumo km/l");
                System.out.println("Inserisci i km");
                double km = Integer.parseInt(sc.nextLine());
                System.out.println("Inserisci i litri");
                double l = Integer.parseInt(sc.nextLine());
                double risultato = km / l;
                System.out.println("Consumo : " + risultato);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
