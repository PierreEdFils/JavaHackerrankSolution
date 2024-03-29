package com.careerdevs;

import java.util.ArrayList;
import java.util.Scanner;

class Prime {
    void checkPrime(int... arr) {
        for (int element : arr) {
            boolean prime = true;
            for (int i = 2; i*i <= element; i++) {
                if (element % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime && element != 1) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}
public class JavaPrimeChecker {
    public static class Prime {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int loopCounter = 0;

        void checkPrime(int value) {
            loopCounter++;
            int primeCounter = 0; boolean isPrime = false;
            for (int i = 1; i <= value; i++) {
                if (value % i == 0) {
                    primeCounter++;
                }

                if (primeCounter > 2) {
                    isPrime = false; break;
                } else if (primeCounter == 2) {
                    isPrime = true;
                }

            }

            if (isPrime) {
                arrayList.add(value);

            }
            if (loopCounter == 4) {
                // do nothing
            } else {
                printArrayItems();
            }


        }

        void printArrayItems() {
            for (Integer item : arrayList) {
                System.out.print(item + " ");
            }
            System.out.println("");
        }



    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Prime prime = new Prime();
        while(scanner.hasNextInt()) {
            prime.checkPrime(scanner.nextInt());
        }

    }
}

