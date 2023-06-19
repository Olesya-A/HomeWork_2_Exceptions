import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение,  что пустые строки вводить нельзя.
 */

public class Task_4 {
    public static void main(String[] args) {
        inputString();
    }

    public static void inputString() {
        System.out.println("Введите текст: ");
        Scanner sc = new Scanner(System.in);
        try {
            String input = sc.nextLine();
            if (input.isEmpty()){;
                throw new IllegalArgumentException();
            }
            System.out.println(input);
        } catch(IllegalArgumentException e) {
            System.out.println("Пустые строки вводить нельзя.");
        } finally {
            sc.close();
        }
    }
}
