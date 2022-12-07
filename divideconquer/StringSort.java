package divideconquer;



// Question1: Apply Merge sort to sort an array of Strings.(Assume that all the characters in all the Strings are in lowercase)
// Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
// Sample Output 1: arr = { "earth", "mars", "mercury","sun"}

public class StringSort {
    public static void main(String[] args) {
      String arr[] = { "sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0 , arr.length-1);
        print(arr);
    }

    //To print the array
    private static void print(String[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void mergeSort(String[] arr, int si, int ei) {
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si ,mid,ei);
    }

    private static void merge(String arr[] , int si ,int mid, int ei) {
         String temp[] = new String[ei-si+1];
         int i = si;
         int j = mid+1;
         int k = 0;

         while(i <= mid && j <= ei){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;

            }
            k++;
         }

        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for(k = 0, i=si;k < temp.length;k++,i++){
            arr[i] = temp[k];
        }


    }


}