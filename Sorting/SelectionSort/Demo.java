package Sorting.SelectionSort;

public class Demo {
    public static void main(String[] args) {
        int nums[]={6,2,6,9,10,52,3};
        int temp=0;
        int minIndex=0;
        System.out.println("before selection sort");
        for(int num:nums){
            System.out.print(num+" ");
        }
        for(int i=0;i<nums.length;i++){
            minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
        }
        System.out.println();
        System.out.println("after selection sort");
        for(int num:nums){
            System.out.print(num+" ");
        }

    
    }
}
