import java.util.Scanner;

public class dwlwtionelement {
    public static void main(String[] args) {
        int capacity=10;
        Integer arr[]=new Integer [capacity];
        Scanner b=new Scanner(System.in);

        for (int i = 0; i <capacity; i++) {
            arr[i]=b.nextInt();

            
        }
        arr=delet(3, arr, capacity);
        for (int i = 0; i < capacity; i++) {
            System.out.print(arr[i]+" ");
            
        }
        b.close();


    }
    static Integer[] delet(int y,Integer[]arr,int capacity){
        for (int i = y; i<capacity-1; i++) {
            arr[i]=arr[i+1];
            
        }
        arr[capacity-1]=null;
        return arr;


    }
}
