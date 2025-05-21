package Searching.BinarySearch;
class Main{
    public static int binarysearch(int nums[],int target){
        int steps=0;
        int start=0;
        int end=nums.length-1;
        int mid;

        while(start<=end){
            steps++;
            mid=(start+end)/2;

            if(nums[mid]==target){
                System.out.println("Steps taken by binary search:"+steps);
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("Steps taken by binary search:"+steps);
        return -1;
    }
}
class Demo{
    public static void main(String[] args) {
        int nums[]={23,46,57,63,67,77,82,93};
        int target=63;
        int result=Main.binarysearch(nums, target);

        if(result!=-1){
            System.out.println("Element found at the index: "+result);
        }
        else
        System.out.println("Element not found!");
    }
}