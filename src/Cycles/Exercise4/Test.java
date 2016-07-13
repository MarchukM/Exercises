package Cycles.Exercise4;
import java.util.*;

/* Имеется неупорядоченный массив из n различных целых чисел от 0 до n
*  (0,1,…,j-1,j+1,….,n). Необходимо за один цикл определить недостающее число j.
* */

public class Test {

    public static void main(String[] args) {
        int size = 15;
        int arr[] = new int[size];
        Test.fillArray(arr, size);
        Test.print(arr);
        Test.findLostNumber(arr, size);
    }

    public static void fillArray(int arr[], int size){
        int lostNumber = new Random().nextInt(size+1);
        int randomArrCell;

        for(int i = 0; i < size; i++){

            do{
                randomArrCell = new Random().nextInt(size);
            } while(arr[randomArrCell] != 0);

            if(i < lostNumber) {
                arr[randomArrCell] = i;
            }
            if(i >= lostNumber){
                arr[randomArrCell] = i+1;
            }
        }
    }

    public static void findLostNumber(int arr[], int size){
        int valuesSum = 0;
        int sumOfI = 0;
        int result;

        for(int i = 0; i < size; i++){ //тот самый цикл
            sumOfI = sumOfI + i;
            if(arr[i] > size - 1){
                continue;
            }
            valuesSum = valuesSum + arr[i];
        }

        result = sumOfI - valuesSum;
        System.out.print("Lost number: ");
        System.out.println(result);
    }

    public static void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
