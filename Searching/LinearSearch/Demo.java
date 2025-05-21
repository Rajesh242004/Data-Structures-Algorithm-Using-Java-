package Searching.LinearSearch;
class Main{
    public static int linearsearch(int num[],int target){
        int steps=0;
        for(int i=0;i<num.length;i++){
            steps++;
            if(num[i]==target){
                System.out.println("Steps taken by linear search: "+steps);
                return i;
            }

        }
         System.out.println("Steps taken by linear search: "+steps);
        return -1;
    }
}
class Demo{
    public static void main(String[] args) {
        int nums[]={5,6,7,8,9,10,16};
        int target=35;
        int result=Main.linearsearch(nums,target);

        if(result!=-1){
            System.out.println("Element fount at index: "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }

}