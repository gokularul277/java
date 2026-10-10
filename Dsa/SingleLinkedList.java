class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}

/////////////////////////////////////////


public class SingleLinkedList {

    node head=null;

    void insertbegin(int data){
        node n=new node(data);
        n.next=head;
        head=n;
    }

    void insertAtlast(int data){
        if(head==null){
            insertbegin(data);
        }
        node n= new node(data);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=n;

    }

    void insert(int index,int value){
        node temp=head;
        node n=new node(value);
        if(temp!=null){
            for (int i = 0; i <index-1; i++) {
                temp=temp.next;
                
            }
            n.next=temp.next;
            temp.next=n;

        }
    }

    void deletebyvalue(int value){
        node temp=head;
        if(temp.data==value){
            head=head.next;
            return;

        }
        while(temp.next!=null){
            if(temp.next.data==value){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
    }

    void deletebyindex(int index){
        if(index<0) return;
        if(head==null) return;
        if(index==0) head=head.next; 

        node temp=head;
        if (temp!=null){
        for (int i = 0; i <index-1&& temp.next!=null; i++) {
            temp=temp.next;
            
        }
        temp.next=temp.next.next;}

    }
    void disp(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.print("null");
    }




    public static void main(String[] args) {
        SingleLinkedList ll=new SingleLinkedList();
        ll.insertbegin(30);
        ll.insertbegin(20);
        ll.insertbegin(10);
        ll.insertAtlast(70);
        ll.insert(2, 21);
        ll.deletebyvalue(30);
        ll.deletebyindex(0);
        ll.disp();
        
    }
}
