import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
    Объявите целочисленные переменные a = 12, b = 27, c = 44, d = 15, e = 9.
    Вычислите выражение a * (b + (c - d * e)) и присвойте его результат переменной result.
    Инвертируйте результат (значение в переменной result), преобразовав его в вариант с противоположным значением
(отрицательное -> положительное, положительное -> отрицательное).
 */
                int a = 12;
                int b = 27;
                int c = 44;
                int d = 15;
                int e = 9;

                int result = a*(b+(c-d*e));
                System.out.println(result);

        // Вариает 1.
                result = - result;
                System.out.println(result);

        // Вариант 2.
                if (result > 0) {
                    result = result - result*2;
                    System.out.println(result);
                } else {
                    result = result+ result*2;
                    System.out.println(result);
                }
        System.out.println("--------------------------");
/*
Объявите целочисленные переменные A = 5 и B = 7.
С помощью математических манипуляций добейтесь того, чтобы a = 7 и b = 5.
Использовать дополнительные переменные или числа запрещено.
 */
                int A = 5;
                int B = 7;
                System.out.println("a = " + A + " и b = " + B);

                A = A + B;
                B = A - B;
                A = A - B;
                System.out.println("a = " + A + " и b = " + B);
        System.out.println("--------------------------");
/*
Объявите переменную m и инициализируйте ее любым трехзначным числом.
Объявите переменную n и, путем математических операций над a получите и присвойте переменной b цифру, которая находится в центре значения из переменной a.
 */
                Scanner in = new Scanner(System.in);
                int x = 0;
                // while для опробования на разных трёх числах;
                while (x<3) {
                    System.out.print("Введите трёхзначное число: ");
                    int m = in.nextInt();
                    int n = (m / 10) % 10;
                    System.out.println("Цифра в середине числа равна: " + n);
                    x++;
                }

    }
}