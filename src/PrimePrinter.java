public class PrimePrinter {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PrimePrinter <number_of_primes>");
            return;
        }

        int x = Integer.parseInt(args[0]);
        printPrimes(x);
    }

    public static void printPrimes(int x) {
        int count = 0;
        int number = 2; // Start checking from 2

        // Print primes with padded binary representations
        count = 0;
        number = 2;
        while (count < x) {
            if (isPrime(number)) {
                String binaryRepresentation = Integer.toBinaryString(number);
                // Pad binary representation with leading zeros
                System.out.println(binaryRepresentation + " " + number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
            i += 6;
        }
        return true;
    }
}
