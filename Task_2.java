/**
 * 2. Если необходимо, исправьте данный код:
 * 
 * try {
 *      int d = 0;
 *      double catchedRes1 = intArray[8] / d;
 *      System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *      System.out.println("Catching exception: " + e);
 * }
 * 
 */

public class Task_2 {
    public static void main(String[] args) {
        task_2();
    }

    public static void task_2() {
        int[] intArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

/*
 * Добавлено исключение ArrayIndexOutOfBoundsException - выход за граница массива
 */
