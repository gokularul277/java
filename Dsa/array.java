class Array{
    int arr[];
    int capacity;
    int size;
    Array(int cap){
        capacity=cap;
        arr =new int[capacity];
        size=0;

    }
    //insert function
    boolean insert(int index,int value){
        if(index<0 ||index>=capacity || size>=capacity|| index>size){
            System.out.println("Invalid Index");
            return false;
        }
        for (int i =size ; i >index; i--) {
            arr[i]=arr[i-1];
            
        }
        arr[index]=value;
        size++;
        return true;

    }

    //display function
    void display(){
        for (int i = 0; i <size; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
    int get(int index){
        if(index>=capacity ||index>= size ||index<0){
            return '\0';
        }
        return arr[index];
    }

    void set(int index ,int value){
        if(index>=capacity  ||index<0){
            System.out.println("index out of bound ");
        }
        arr[index]=value;
        size++;

    } 

    boolean delete(int index){
        if(index<0 ||index<size){
            System.out.println("Invalid index");
            return false;
        }
        for (int i = index; i < size; i++) {
            arr[i]=arr[i+1];

            
        }
        size--;
        return true;


    }


}

public class array {
    public static void main(String[] args) {
        Array a=new Array(7);
        System.out.println(a.capacity);
        a.set(0,55);
        a.set(1,57);
        a.set(2,58);
        a.set(3,59);
        a.display();
        a.insert(1, 56);
        a.display();


        
    }
}
