import java.util.Arrays;

public class SELECTION_SORT {

    //logic is to find the smallest among the array and send it to the first position and so on

    public static void selectionSort(int[] arr){

        
        for(int i = 0; i< arr.length-1;i++){
            int smallest = i;

        
         for(int j = i+1 ; j< arr.length; j++){

            // condition to find the smallest
            if(arr[j] < arr[smallest]){

                smallest =j;
            }

        }
      // after finding the smallest from unsorted array swap to first position

      // swap
      int temp = arr[i]; // i = 0  ,  now index 0 became sorted part and index 1 to last is unsorted 
      arr[i] = arr[smallest];
      arr[smallest] = temp;
    

        }


    }

    public static  void main(String[] args){

        int[] array = { 22, 3, 1 , 5, 33};

        // calling my function
        selectionSort(array);
        System.out.println(Arrays.toString(array)); // visualise my array

    }

    
    
}
