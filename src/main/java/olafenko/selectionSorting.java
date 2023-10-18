package olafenko;

import java.util.Arrays;
import java.util.Random;

public class selectionSorting {


    int[] numbers = new int[10];



    public void run(){

        Random random = new Random();

        for(int i = 0;i<numbers.length;i++){
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));

    }

    private void selectionSort(int[] arr){

        int length = numbers.length;



        for (int i = 0; i<length - 1;i++){
            int smallest = arr[i];
            int smallestIndex = 0;
            for(int j = i+1;j<length;j++){

                if(arr[j] < smallest){
                    smallest = arr[j];
                    smallestIndex = j;
                    swap(arr,i,smallestIndex);
                }



            }

        }

    }
    private void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }






}
