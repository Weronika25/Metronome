/**
 * Created by Michał on 23-Nov-15.
 */

import java.util.Scanner;

public class Nuta {
    boolean nuta;
    boolean GetNuta(){
        System.out.println("Zaznaczać pierwszą nutę w takcie? (true/false)");
        Scanner sc = new Scanner(System.in);
        boolean nuta = sc.nextBoolean();
        return nuta;
    }
}
