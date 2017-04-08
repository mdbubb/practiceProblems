/**
 * Created by mdb17 on 4/8/2017.
 */
public class Methods {
    public static void findClosestPrimeNumber(int n) {
        int num = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                num++;
                break;
            }
        }
        if (n == 0) {
            System.out.println("2");
        } else if (num > 0) {
            findClosestPrimeNumber(n + 1);
        } else {
            System.out.println(n);
        }

    }
}