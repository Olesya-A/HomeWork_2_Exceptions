/**
 * Дан следующий код, исправьте его там, где требуется:
 * 
 * public static void main(String[] args) throws Exception {
 *      try {
 *          int a = 90;
 *          int b = 3;
 *          System.out.println(a / b);
 *          printSum(23, 234);
 *          int[] abc = { 1, 2 };
 *          abc[3] = 9;
 *      } catch (Throwable ex) {
 *          System.out.println("Что-то пошло не так...");
 *      } catch (NullPointerException ex) {
 *          System.out.println("Указатель не может указывать на null!");
 *      } catch (IndexOutOfBoundsException ex) {
 *          System.out.println("Массив выходит за пределы своего размера!");
 *      }
 * }
 * 
 * public static void printSum(Integer a, Integer b) throws FileNotFoundException {
 *      System.out.println(a + b);
 * }
 * 
 */

public class Task_3 {

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя.");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }

}

/**
* 1. Исключение Throwable является суперклассам, поэтому его обраотка иет в последнюю очередь. 
* Обработка исключений должна идти от наследника к родительскому классу.
* 2. Можно добавить исключение ArithmeticException для операции деления.
* 3. Метод printSum не работает с файлами, поэтому не может вызвать исключение FileNotFoundException
*/