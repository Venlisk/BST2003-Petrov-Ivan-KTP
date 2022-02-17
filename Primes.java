import java.util.Scanner;
public class Primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число. Меньше него будут простые числа в ответе: ");
        int input = in.nextInt();
        for (int n = 2; n <= input; n++) {
            int p = n;
            boolean outputNum = isPrime(n);
            if (outputNum)
                System.out.print(p + " ");
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
