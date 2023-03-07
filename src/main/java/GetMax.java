public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    static int arr[] = {10, 324, 45, 90, 9808};
int max = arr[0]; 
    public int max(int[] arr){
        int max = arr[0]; 
        //static int arr[] = {10, 324, 45, 90, 9808};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max){
                max = arr[i];
            }
                
                return max;
        
    }
  
}
