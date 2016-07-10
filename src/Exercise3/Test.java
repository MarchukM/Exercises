package Exercise3;
import java.util.Random;
import java.util.Arrays;
/**
 * Имеются два массива данных А[а] и B[в] (а и в – количества элементов массива).
 * Известно, что оба массива упорядочены по возрастанию. Необходимо написать алгоритм,
 * проходящий по этим массивам за 1 цикл вида:
 * for (int i = 0; i < a + b; i++) {...}
 * и выдающий значения обоих массивов в порядке возрастания
 * т.е. как бы объединив оба массива и отсортировав их по возрастанию.
 */


public class Test {

    public void print(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void fillArray(int arr[], int size){
        Random rand = new Random();
        int x;

        for(int i = 0; i < size; i++){
            x = rand.nextInt(20);
            arr[i] = x;
        }
    }

    public void inAscendingOrder(int arr1[], int arr2[], int size1, int size2){
        int x = 0; // iterator for arr1
        int y = 0; // for arr2
        boolean flag1 = false;
        boolean flag2 = false;

        for(int i = 0; i < size1 + size2; i++){
            if(flag1){
                System.out.print(arr2[y] + " ");
                if(y != size2 - 1) {
                    ++y;
                }
                continue;
            }

            if(flag2){
                System.out.print(arr1[x] + " ");
                if(x != size1 - 1){
                    ++x;
                }
                continue;
            }

            if(arr1[x] <= arr2[y]){
                System.out.print(arr1[x] + " ");
                if(x != size1 - 1) {
                    ++x;
                }else{
                    flag1 = true;
                }
                continue;
            }
            if(arr1[x] > arr2[y]){
                System.out.print(arr2[y] + " ");
                if(y != size2 - 1) {
                    ++y;
                }else{
                    flag2 = true;
                }
                continue;
            }
        }
    }

    public static void main(String[] args) {

        int size1 = 10;
        int size2 = 5;

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        Test t = new Test();

        t.fillArray(arr1, size1);
        t.fillArray(arr2, size2);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.print("Array 1: ");
        t.print(arr1);

        System.out.print("Array 2: ");
        t.print(arr2);

        System.out.print("Result:  ");
        t.inAscendingOrder(arr1, arr2, size1, size2);
    }
}
