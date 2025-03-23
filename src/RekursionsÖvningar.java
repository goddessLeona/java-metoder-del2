
import java.lang.*;

public class RekursionsÖvningar {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Summan av 1 till " + n + " är: " + summa(n));
    }

    public static int summa(int n){

        if (n <= 1)
            return n;
        return n + summa(n - 1);
    }
}
