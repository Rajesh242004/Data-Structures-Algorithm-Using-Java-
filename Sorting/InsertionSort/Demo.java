package Sorting.InsertionSort;
class Demo{
    public static void main(String[] args) {
        int num[]={5,2,7,8,1,9,2,2,10,3};
        for(int i=1;i<num.length;i++){
            int j=i-1;
            int key=num[i];
            while(j>=0 && num[j]>key){
                num[j+1]=num[j];
                j--;
            }
            num[j+1]=key;
        }
        for(int nums:num){
            System.out.print(nums+" ");
        }
    }
}
       