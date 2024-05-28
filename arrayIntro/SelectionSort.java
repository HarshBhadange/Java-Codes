package arrayIntro;

public class SelectionSort {
    public static void printarray(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        return;
    }
    public static void Selectionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            //Insert an element at ith position
            int min=Integer.MAX_VALUE;
            int minIndex= -1;
            for (int j  = i;j  < n; j++) {
                //finding min elements among j index
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }

            }//Swapping the element at MinIndex with ith element
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

    }
    public static void main (String[] args){



        int[] arr={1,6,4,8,0,3};
        Selectionsort(arr);
        printarray(arr);
    }
}
