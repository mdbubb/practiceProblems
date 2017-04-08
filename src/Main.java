import java.util.Scanner;

/**
 * Created by mdb17 on 4/8/2017.
 */
public class Main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Number please");
        int num = input.nextInt();
        Methods.findClosestPrimeNumber(num);
    }
}
