package Sorting.BubbleSort;

public class Demo {
    public static void main(String[] args) {
        int nums[]={76,27,46,12,2,98,1,0,45};
        int temp=0;
        System.out.println("before sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("after sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
