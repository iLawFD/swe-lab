
public class Main {
    public static void main(String[] args) {
        int [] arr = {5,2,12,12,1};
        sortInsertion(arr);

        for(int i=0;i<arr.length;++i){
          System.out.print(arr[i] + " ");
        }
    }


    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    //Applies Insertion sort in an array
    public static void sortInsertion(int [] sort_arr){

        for(int i=0;i<sort_arr.length;++i){
  
          int j = i;
          
          while(j > 0 && sort_arr[j-1]>sort_arr[j]){
  
            int key = sort_arr[j];
            sort_arr[j] = sort_arr[j-1];
            sort_arr[j-1] = key;
            j = j-1; 
  
          }
        }
      }
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}

