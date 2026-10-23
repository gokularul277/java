public class Singlell2 {

    node head=null;

    void inserAtbefore(int data){
        node n=new node(data);
        n.next=head;
        head=n;
    }

    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        if(temp==null){
        System.out.println("null");}
    }

    void insertatend(int data){
        node n=new node(data);
        node temp=head;
        if(head==null){
            inserAtbefore(data);
        }
        while(temp.next!=null){
            temp=temp.next;
            
        }
        temp.next=n;
        
    }

    void insertinmiddle(int index,int data){
        if(index<0) return;
        if (index==0) inserAtbefore(data);
        node n=new node(data);
        node temp=head;
        for (int i = 0; i <index-1; i++) {
            temp=temp.next;
            
        }
        n.next=temp.next;
        temp.next=n;
        
        
    }
    void deletebyvalue(int data){
        node temp=head;
        while(temp.next!=null){
            if(temp.next.data==data){
                temp.next=temp.next.next;

            }
            temp=temp.next;

        }
    }
    
    void deletebyindex(int index){
        node temp=head;
        if(index<0){
            return ;
        }
        if(index==0){
            head=null;
        }
        for (int i = 0; i <index-1; i++) {
            temp=temp.next;
            
        }
        temp.next=temp.next.next;
    }

   
   
    public static void main(String[] args) {
        Singlell2 l=new Singlell2();
        l.inserAtbefore(12);
        //l.inserAtbefore(11);
        //l.insertatend(13);
        //l.insertinmiddle(2, 12);
        //l.deletebyvalue(12);
        //l.deletebyindex(1);
        //l.deletebyindex(1);
        //l.deletebyindex(1);
        l.display();

        
    }
    
}








































class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
