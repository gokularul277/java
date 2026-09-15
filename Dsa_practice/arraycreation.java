import java.util.Scanner;

public class arraycreation {
    public static void main(String[] args) {
        int capacity=10;
        int arr[]=new int [capacity];
        Scanner sc=new Scanner(System.in);


        for (int i = 0; i <capacity; i++) {
            arr[i]=sc.nextInt();
            
        }
        arr=insert(arr,3,70,capacity);
        
        for (int i = 0; i < capacity; i++) {
            System.out.println(arr[i]);
            
        }
    }

    static int[] insert(int arr[],int y,int v,int capacity){
        for (int i =capacity-1; i >y; i--) {
            arr[i]=arr[i-1];
            
            
            
        }
        arr[y]=v;
        return arr;


    }
}
