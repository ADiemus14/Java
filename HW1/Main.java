package org.example;

public class Main {
    public static void main(String[] args) {
//        public void printPrimeNums () {
            boolean isPrime;
            for (int i = 1; i < 1000; i++) {
                isPrime = i == 1;
                for (int j = 2; j < 1000; j++) {
                    if (i >= j && i % j == 0) {
                        if (j == i) {
                            isPrime = true;
                        }
                        break;
                    }
                }
                if (isPrime) System.out.println(i);
            }
        }
    }
