/**
 * Created by Michał on 23-Nov-15.
 */

import java.util.Scanner;

public class Metrum{
    int met1;
    int met2;
    int GetMet1(){
        System.out.println("Podaj pierwszą wartość metrum");
        Scanner sc = new Scanner(System.in);
        int met1 = sc.nextInt();
        return met1;
    }
    int GetMet2(){
        System.out.println("Podaj drugą wartość metrum");
        Scanner sc = new Scanner(System.in);
        int met2 = sc.nextInt();
        return met2;
    }

}
