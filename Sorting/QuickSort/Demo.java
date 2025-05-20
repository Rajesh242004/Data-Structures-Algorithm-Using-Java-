package Sorting.QuickSort;

class Main{
    public static void quickSort(int arr[],int start,int end){
        if(start<end){
            int pi=partition(arr,start,end);
            quickSort(arr,start,pi-1);
            quickSort(arr,pi+1,end);
        }
    }
    public static int partition(int arr[],int start,int end){
        int pivot=arr[end];
        int i=start-1;
        int temp;
        

        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;

        return i+1;

    }
}
class Demo{
    public static void main(String[] args) {
        int num[]={4,3,45,2,34,5,6,7,4,2,12,4,5,7,8,9,6,5,4,3,2,2,3,45,3,4,43};
        Main.quickSort(num,0,num.length-1);
        for(int nums:num){
            System.out.print(nums+" ");
        }
    }
}

