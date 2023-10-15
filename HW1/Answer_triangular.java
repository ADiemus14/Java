
        import java.util.Scanner;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//Внутри класса Answer напишите метод countNTriangle,
//который принимает число n и возвращает его n-ое треугольное число.
//пример:
//n=4->10
//n=5->15

public class Answer_triangular {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int n = iScanner.nextInt();
        System.out.print(countNTriangle(n));

    }
    public static int countNTriangle(int n) {
        int m = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + m;
            m++;
        }
        return sum;
    }
}










