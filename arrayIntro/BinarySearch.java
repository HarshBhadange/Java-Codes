package arrayIntro;

public class BinarySearch {
    public static int binarySearch(int[] arr,int ele){
        int start=0;
        int end =arr.length-1;
        while(start<=end){

            int mid=(start+end)/2;
            if(arr[mid]>ele){
                end=mid-1;
            } else if (arr[mid]<ele) {
                start=mid+1;
            }else{
                return mid;
            }
        }return -1;
    }
    public static void main(String[] args){
        int[] arr={1,3,4,5,6,7,8,9};
        int index=binarySearch(arr,5);
        System.out.println("Num found at index "+index);
    }
}
