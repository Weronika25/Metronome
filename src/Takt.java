/**
 * Created by Michał on 23-Nov-15.
 */
import java.util.Scanner;
public class Takt {
    int takt;
    int GetTakt(){
        System.out.println("Podaj ilość taktów");
        Scanner sc = new Scanner(System.in);
        int takt = sc.nextInt();
        return takt;
    }
}
