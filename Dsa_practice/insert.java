public class insert {
    public static void main(String[] args) {
        insert k=new insert(8);
        k.soruvu(0, 11);
        k.soruvu(1, 12);
        k.soruvu(2, 13);
        k.soruvu(3, 15);
        k.soruvu(4, 19);
        k.soruvu(5, 100);
        k.soruvu(6, 198);
        k.print();
        




    }
    int capacity;
    int size;
    int []arr;
    insert(int capacity){
        
        arr=new int [capacity];
        this.capacity=capacity;
        size=0;


    }

    boolean soruvu(int index,int value){
        if(index>size ||index<0 ){
            return false;
        }
        if(index>=size){
            resize();
        }
        for (int i =size; i >index; i--) {
            arr[i]=arr[i-1];

            
        }
        arr[index]=value;
        size++;
        return true;

    }

    boolean azhi(int index){
        if(index>=size ||index<0  ){
            return false;
        }
        for (int i = index; i <size-1; i++) {
            arr[i]=arr[i+1];
            
        }
        size--;
        return true;
    }

    int get(int index){
        return arr[index];

    }

    boolean set(int index,int value){
        if(index<0 || index>=size){
            return false;
        }
        arr[index]=value;
        return true;

    }
    void print(){
        for (int i = 0; i <size; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    int search(int value){
        for (int i = 0; i <size; i++) {
            if(arr[i]==value){
                return i;
            }
            
        }
        return '\0';
    }
    void resize(){
        int []newarr=new int[2*capacity];
        for (int i = 0; i < size; i++) {
            newarr[i]=arr[i];
            
        }
        arr=newarr;
        capacity*=2;

    }
}


