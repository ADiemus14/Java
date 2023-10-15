import java.util.Scanner;

/*Напишите функцию printPrimeNums,
которая выведет на экран все простые числа
в промежутке от 1 до 1000, каждое на новой строке.
Напишите свой код в методе printPrimeNums класса Answer.*/


class Answer_PrimeNums {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        for (int i = 2; i < 10; i++) {
            int count = 0;
            for (int m = 1; m < 10; m++) {
                int n = i % m;
                System.out.println(i + "%" + m + "= " + n);
                System.out.println(count + "count");
                if (n == 0) {
                    count++;
                }
                if (count == 2) {
                    System.out.println(" " + i);
                }


            }

        }
    }
}
// ИТОГОВОЕ

//    boolean isPrime;
//            for (int i = 1; i < 1000; i++) {
//        isPrime = i == 1;
//        for (int j = 2; j < 1000; j++) {
//        if (i >= j && i % j == 0) {
//        if (j == i) {
//        isPrime = true;
//        }
//        break;
//        }
//        }
//        if (isPrime) System.out.println(i);
//        }

