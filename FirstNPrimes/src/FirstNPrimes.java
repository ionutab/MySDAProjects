import java.util.Scanner;

public class FirstNPrimes {

//    public static void IsPrimeNumber(int number) {
//        int divisor = 0;
//
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                divisor++;
//            }
//        }
//    }

    public static void printArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
    }

    public static void printFirstNPrimes(int n) {
        int primesFound = 0;
        int i = 2;
        int[] primes = new int[n];

        while (primesFound < n) {

            int divisors = 0;
//            System.out.println("Testam numarul " + i);
//
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    divisors++;
//                }
//            }

            int j = 2;
            while(j <= (i/2) && (divisors == 0)){
//                System.out.println("i: " + i + " j: " + j);
                if(i % j == 0){
                    divisors++;
                }
                j++;
            }

//            System.out.println("divisors " + divisors);

            if (divisors == 0) {
                primes[primesFound] = i;
                primesFound++;
            }

            i++;
        }

        System.out.println("Numere prime gasite: ");
        printArray(primes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Determining first " + n + "primes");

        printFirstNPrimes(n);

        int m = scanner.nextInt();
        System.out.println("Determining first " + m + "primes");
        printFirstNPrimes(m);
    }

}
