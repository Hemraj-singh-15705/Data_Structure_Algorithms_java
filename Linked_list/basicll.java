import java.util.*;
public class basicll{
    public static class Node{
        int data;
        Node next; 
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newNode =new Node(data);
        size++;
        if (head ==null){
            head =tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode =new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print (){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public void add(int idx,int data ){
    if(idx==0){
        addfirst(data);
        return;
    }
    Node newNode=new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    newNode.next =temp.next;
    temp.next=newNode;
}
public int removefirst(){
    if(size==0){
        System.out.println("Linked List is Empty");
        return 0;
    }else if(size==1){
        int val =head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val =head.data;
    head=head.next;
    size--;
    return val;
}
public int itrSearch(int key){
    Node temp=head;
    int i=0;
    while (temp!=null){
        if(temp.data==key){
        return i;
        }
    temp=temp.next;
    i++;
    }
    return -1;
} 


public void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }     
    head = prev;
}  



public int deletNthfromEnd(int n){
    int sz = 0;
    Node temp = head;
    while (temp!=null){
        temp=temp.next;
        sz++;
    }
    if(n==sz){
        head = head.next;
        return 1; 
    }
    int i = 1;
    int iToFind = sz-n;
    Node prev = head ;
    while(i<iToFind){
        prev = prev.next;
        i++;
    }
    prev.next = prev.next.next;
    return 1;
}

//slow fast Approach 
public Node findMid(Node head){
    Node slow=head;
    Node fast= head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;//+1
        fast=fast.next.next;//+2
    }
    return slow; // mid node
}


public Boolean checkPalindrome(){
    if(head==null || head.next==null){
        return false;
    }
    Node midNode = findMid(head);
    Node prev = null;
    Node curr = midNode;
    Node next;
    while ( curr!= null){
        next =  curr.next;
        curr.next=prev; 
        prev = curr;
        curr = next;
    }
    Node right = prev;
    Node left = head; 
    while (right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next.next; 
    }
    return true;
}

//check linked list is create a cycle or not 

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        if(head == null){
            return false;
        }
        while(fast != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true; //Cycle exists 
            }
        }
        return false;   //Cycle does not exists 
    }
//remove cycle 

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public void zigzag(){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next != null){
            slow = head.next;
            fast = head.next.next;

        }
        Node mid = slow;
        Node Curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(Curr != null){
            next = Curr.next;
            Curr.next =prev;
            prev = Curr;
            Curr = next;
        }
        Node left =head;
        Node right = prev;
        Node nextL,nextR;

        while (left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }

    public static void main (String args[]){
        basicll ll =new basicll();
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.addlast(5);
        ll.print();
        // ll.add(2,3);
        // ll.print();
        // System.out.println("Size of linked List = "+ll.size);
        // ll.removefirst();
        // ll.print();
       // System.out.println(ll.itrSearch(3));
        //System.out.println(ll.itrSearch(12));
        // System.out.println(ll.reverse());
        // System.out.println(ll.deletNthfromEnd(3));
        // ll.print();
        System.out.print(ll.checkPalindrome());
        ll.print();

    }
}
