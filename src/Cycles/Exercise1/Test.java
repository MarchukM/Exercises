package Cycles.Exercise1;

/**
 * За один цикл вычислить значение функции F(n) = 1!*2!*3!...*n!., где n! = 1*2*3*…*n. /без рекурсии/
 */

public class Test {

    public int function(int num) {

        int[] arr = new int[num];
        int result = 1;
        int finalResult = 1;

        for (int i = 1; i <= num; i++) {
            result = result * i;
            arr[i-1] = result;
            finalResult = finalResult * arr[i-1];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Test e = new Test();
        int result = e.function(5);
        System.out.println(result);
    }
}
