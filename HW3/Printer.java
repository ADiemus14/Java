////ЗАДАЧА 1 Сортировка слиянием
////
////Внутри класса MergeSort напишите метод mergeSort,
////который принимает массив целых чисел a и реализует алгоритм сортировки слиянием.
////Метод должен возвращать отсортированный массив.
////
////        Пример
////
////
////        a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
//
//import java.util.Arrays;
//
//class MergeSort {
//    public static int[] mergeSort(int[] a) {
//        int n = a.length;
//        if (n < 2) {
//            return a;
//        }
//        int mid = n / 2;
//        int[] l = new int[mid];
//        int[] r = new int[n - mid];
//
//        for (int i = 0; i < mid; i++) {
//            l[i] = a[i];
//        }
//        for (int i = mid; i < n; i++) {
//            r[i - mid] = a[i];
//        }
//        l = mergeSort(l);
//        r = mergeSort(r);
//
//        return merge(l, r);
//    }
//
//    public static int[] merge(int[] l, int[] r) {
//
//        int left = l.length;
//        int right = r.length;
//        int[] a = new int[left + right];
//        int i = 0, j = 0, k = 0;
//
//        while (i < left && j < right) {
//            if (l[i] <= r[j]) {
//                a[k++] = l[i++];
//            }
//            else {
//                a[k++] = r[j++];
//            }
//        }
//        while (i < left) {
//            a[k++] = l[i++];
//        }
//        while (j < right) {
//            a[k++] = r[j++];
//        }
//
//        return a;
//    }
//}
//
//public class Printer{
//    public static void main(String[] args) {
//        int[] a;
//
//        if (args.length == 0) {
//            a = new int[]{5, 1, 6, 2, 3, 4};
//        } else {
//            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//        }
//
//        MergeSort answer = new MergeSort();
//        String itresume_res = Arrays.toString(answer.mergeSort(a));
//        System.out.println(itresume_res);
//    }
//}


////__________________________________________________________________________________________
////ЗАДАЧА 2 Удаление четных элементов
//
////Напишите функцию removeEvenNumbers,
////которая принимала бы произвольный список целых чисел,
////удаляла бы из него четные числа и выводила список без четных чисел.
////
////Напишите свой код в методе removeEvenNumbers класса Answer.
////Метод removeEvenNumbers принимает на вход один параметр:
////
////Integer[] arr - список целых чисел
//
////Пример
////
////
////        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
////        removeEvenNumbers(arr);
////
////// [1, 3, 5, 7, 9]
////
////        arr = new Integer[]{2, 4, 6, 8};
////        removeEvenNumbers(arr);
//
//import java.util.Arrays;
//import java.util.ArrayList;
//
//class Answer {
//    public static void removeEvenNumbers(Integer[] arr) {
//        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
//        for (int i = 0; i < ints.size(); i++) {
//            if (ints.get(i) % 2 == 0) {
//                ints.remove(i);
//                i--;
//            }
//        }
//        System.out.println(ints);
//    }
//}
//
//public class Printer{
//    public static void main(String[] args) {
//        Integer[] arr = {};
//
//        if (args.length == 0) {
//            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .map(Integer::parseInt)
//                    .toArray(Integer[]::new);
//        }
//
//        Answer ans = new Answer();
//        ans.removeEvenNumbers(arr);
//    }
//}



////__________________________________________________________________________________________
////ЗАДАЧА 3 Анализатор списка

////Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
////
////Сортирует его по возрастанию и выводит на экран
////Находит минимальное значение в списке и выводит на экран - Minimum is {число}
////Находит максимальное значение в списке и выводит на экран - Maximum is {число}
////Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
////Напишите свой код в методе analyzeNumbers класса Answer.
////Метод analyzeNumbers принимает на вход один параметр:
////
////Integer[] arr - список целых чисел
////
////Пример
////
////
////        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
////        analyzeNumbers(arr)
////
////// [1, 2, 3, 4, 5, 6, 7, 8, 9]
////// Minimum is 1
////// Maximum is 9
////// Average is = 5
//
//
//import java.util.Arrays;
//import java.util.ArrayList;
//
//class Answer {
//    public static void analyzeNumbers(Integer[] arr) {
//        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
//        ints.sort(Integer::compareTo); // сортировка списка по возрастанию
//        System.out.println(ints); // вывод списка на экран
//        System.out.println("Minimum is " + ints.get(0)); // нахождение минимального значения в списке и вывод на экран
//        System.out.println("Maximum is " + ints.get(ints.size()-1)); // нахождение максимального значения в списке и вывод на экран
//
//        int sum = 0;
//        for(int i : ints){ // вычисление суммы всех элементов списка
//            sum += i;
//        }
//        System.out.println("Average is = " + sum / ints.size()); // вычисление среднего арифметического значений списка и вывод на экран
//    }
//}
//
//public class Printer{
//    public static void main(String[] args) {
//        Integer[] arr = {};
//
//        if (args.length == 0) {
//            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .map(Integer::parseInt)
//                    .toArray(Integer[]::new);
//        }
//
//        Answer ans = new Answer();
//        ans.analyzeNumbers(arr);
//    }
//}
