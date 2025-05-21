package Lists.Queue;

class Queue{
    private int front=0;
    private int rear=-1;
    private int []arr=new int[5];
    private int size=0;

    public void enqueue(int data){
        rear++;
        arr[rear]=data;
        size++;
    }
    public int deueue(){
        front++;
        return arr[front];
    }
    public void show(){
        for(int i=front;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        
    }
}
class Demo{
    public static void main(String[] args) {
        Queue que = new Queue();
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.enqueue(50);

        que.deueue();
        que.deueue();

        que.show();
    }
}
