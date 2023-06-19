import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Реализуйте метод, который запрашивает у пользователя ввод 
 * дробного числа (типа float),и возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task_1 {
    public static void main(String[] args) {
        inputNumber();
    }

    public static float inputNumber() {
        try {
            System.out.println("Введите дробное число: ");
            Scanner sc = new Scanner(System.in);
            float num = sc.nextFloat();
            System.out.println(num);
            return num;
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Попробуйте еще раз.");
            inputNumber();
            return 0;
        }
    }

}