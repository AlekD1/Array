import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите размерность массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        double arr[] = new double[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextDouble(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + arr[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
        // 1) Номер минимального элемента массива
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Номер минимального элемента массива: " + minIndex+", а значение равно " + arr[minIndex]);

        // 2) Сумма элементов массива, расположенных после первого отрицательного элемента
        int k = 1;
        double s = 0;
        for (int i=0;i <size;i++) {
            if (k == 1) {
                if (arr[i] < 0) {
                    k=0; }
            } else s = s + Math.abs(arr[i]);
        }
        System.out.println("Сумма элементов массива, расположенных после первого отрицательного элемента: " + s);
        int a,b;
        do{
            System.out.println("Введите a: ");
            a = input.nextInt();
            System.out.println("Введите b: ");
            b = input.nextInt();
            if (b < a ){
                System.out.println("Число а должно быть меньше б. Попробуйте еще раз");
            } else break;
        } while (a<b);
        double brr[] = new double[size];
        int t=0;
        for (int i = 0; i < size; i++) {
            if (((arr[i] >= a) && (arr[i] <= b)) == false) {
                brr[t] = arr[i];
                t++;
            }
        }
        System.out.println("Массив А:");
        for (int i = 0; i < t; i++) {
            System.out.println("B[" + i + "]="+ brr[i]);
        }
        double temp;
        int j;
        for (int i = 1; i < t; i++) {
            temp = brr[i];
            for (j = i - 1; (j >= 0) && (brr[j] > temp); j--) {
                brr[j + 1] = brr[j];
                brr[j] = temp;
            }
        }
        System.out.println("Массив А после сортировки:");
        for (int i = 0; i < t; i++) {
            System.out.println("B[" + i + "]="+ brr[i]);
        }
    }
}
