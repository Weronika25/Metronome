import java.util.Scanner;

/**
 * Created by Michał on 23-Nov-15.
 */
public class Tempo {
    int tempo;
    int GetTempo(){
        System.out.println("Podaj tempo");
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        return tempo;
    }

}
