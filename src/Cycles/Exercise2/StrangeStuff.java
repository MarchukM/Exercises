package cycles.exercise2;

/**
 * Составить программу последовательного заполнения квадратного
 * массива натуральными числами от 1 до n*n(n в квадрате)
 * по часовой стрелке по спирали, например, при n=3
 * <p>
 * 1 2 3
 * 8 9 4
 * 7 6 5
 */

public class StrangeStuff {

    private int size;
    private int i;
    private int j;
    private int arr[][];
    private int num ;
    private int direction;
    private int numberOfElements;


    public StrangeStuff(int size){
        setSize(size);
        i = 0;
        j = 0;
        arr = new int[size][size];
        num = 1;
        direction = 1;
        numberOfElements = size*size;
    }


    public void setSize(int size){
        this.size = (size > 0 ? size : 3);
    }

    public void fillArray(){
        putNumber();

        if(size == 1){
            return;
        }

        doStep(direction);
        int result = whatsUp();

        while (result != 2){

            if(result == 3){
                putNumber();
            }
            if(result == 0){
                stepBack(direction);
                changeDirection();
            }
            if(result == 1){
                putNumber();
                changeDirection();
            }

            doStep(direction);
            result = whatsUp();

            if(result == 2){
                putNumber();
            }
        }
    }

    private void changeDirection(){
        if(direction % 4 == 0){
            direction = 1;
        } else{
            direction++;
        }
    }

    private void doStep(int direction){
        switch (direction){
            case 1 :{  //step to the right
                j++;
                break;
            }
            case 2 :{ //step down
                i++;
                break;
            }
            case 3 :{
                j--; //step to the left
                break;
            }
            case 4 :{
                i--;
                break;
            }
            default:{
                System.out.println("Illegal direction");
            }
        }
    }

    private void stepBack(int direction){
        switch (direction){
            case 1 :{  //step to the right
                j--;
                break;
            }
            case 2 :{ //step down
                i--;
                break;
            }
            case 3 :{
                j++; //step to the left
                break;
            }
            case 4 :{
                i++;
                break;
            }
            default:{
                System.out.println("Illegal direction");
            }
        }
    }

    private int whatsUp(){
        if(size == 2 &&  num == 4) {
            return 2;
        }
        if(arr[i][j] != 0){
            return 0;       //the cell is occupied
        }
        if(j == size - 1 && direction == 1){
            return 1;       //next step is out of range
        }
        if(i == size - 1 && direction == 2){
            return 1;       //next step is out of range
        }
        if(j == 0 && direction == 3){
            return 1;       //next step is out of range
        }
        if(i == 0 && direction == 4){
            return 1;       //next step is out of range
        }
        if(num == numberOfElements){
            return 2;       //the end
        }
        return 3;           //all right, can continue
    }

    private void putNumber(){
        arr[i][j] = num++;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.printf(" %-3d", arr[i][j]);
            }
        }
    }
}
