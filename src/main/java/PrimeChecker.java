package main.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class PrimeChecker {
    private static final Logger logger = LoggerFactory.getLogger(PrimeChecker.class);

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Ingrese un número: ");
        
        int number = scanner.nextInt();
        scanner.close();
        
        if (isPrime(number)) {
            logger.info("{} es un número primo.", number);
        } else {
            logger.info("{} no es un número primo.", number);
        }
    }
}
