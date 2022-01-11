
package clinic_final_project;


public class Clinic {
    int [] array;
    int size;
    int rear;
    int front;
    boolean found = false;

    
    public Clinic(int size){
        this.size = size;
        rear = -1;
        front = -1;
        array = new int[size];
    }
    
    //...................................................................................
    public void enqueue(int x){
       if(isFull()){
           System.out.println("Is empty");
       } 
       rear += 1;
       array[rear]=x;
       if(front == -1){
           front = 0;
       }
    }
    
    
    //...................................................................................
    public boolean isFull(){
        return(rear == size -1);
    }
    
    //....................................................................................
    
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Is Empty");
        }
        int item = array[front];
        front += 1;
        return item;
        
    }
    
    //..................................................................................... 
    
    public boolean isEmpty(){
        return(front == -1 || front > rear);
    }
    
    //.....................................................................................
    public void display(){
        int i;
        if(isEmpty()){
            System.out.println("Is Empty");
        }else{
            System.out.print("Queue --> " );
            for(i = front; i<= rear ; i++){
                System.out.print(array[i] + " ");
                
            }
        }
    }
    //.....................................................................................
    public void sort(){
        int temp;
        int n = size;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(array[j-1]>array[j]){
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j] = temp;        
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + " ");
        }
}
    
    
    //......................................................................................
    public void search(int x){
        for(int n : array){
           if(n == x) {
               found = true;
               break;
           }
        }
        if(found)
            System.out.println("Is found.");
        else
            System.out.println("Is not found");
    }
    
}
