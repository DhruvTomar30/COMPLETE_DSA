public class LinkedList {
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

    // .......... Add First in Linked List .........
    public void addFirst(int data){
        // step1= create new Node
        Node newNode=new Node(data);
         size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        // step2 - newNode next=head
        newNode.next=head;  // link

        // step3 - head=newNode
        head=newNode;
    }

    // ............ Add last node in Linked lIst.........
    public void addLast(int data){
        // step1= create new Node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        // step2 - tail.next=newnode
        tail.next=newNode;
        // step3 - tail=newNode
        tail=newNode;
    }

    public void print(){   // O(n)...
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // ..............Add Node in the Middle......... 
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // i=idx-1; temp---> prev
        newNode.next=temp.next;
        temp.next=newNode;
    }


    // <--------------- Remove First Node -------------------->
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    
    // <----------------- Remove last Node ------------------>
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // prev: i= size-2;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;   // tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    // <------------- Search (ITERATIVE) ------------->
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){  // key found
                return i; 
            }
            temp=temp.next;
            i++;
        }
        return -1;   // key not found
    }

    // <-------------- Search (RECURSIVE) ------------>
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    // <---------------- Reverse a Linked List ------------------->
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    // <-----Find and remove Nth Node from end --------->
    public void deleteNthfromEnd(int n){
        // calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;  // remove first
            return;
        }
        // sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next; // jump seedha 2 se 4th node pe....
        return;
    }


    // <----------- Check if LL is a Palindrome -------------------->

        // slow-fast Approach.. 
    public Node FindMid(Node head){      //helper
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;   //+1
            fast=fast.next.next; //+2
        }
        return slow;  // slow is my midNode
    }

    public boolean CheckPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        // step1 - find mid
        Node midNode=FindMid(head);

        // step2 - reverse second half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev; // right half head 
        Node left=head;

        // step3 - check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
}


    public static void main(String args[]){
        LinkedList l1=new LinkedList();
        // l1.addFirst(2);
        // // l1.print();
        // l1.addFirst(1);
        // // l1.print();
        // l1.addLast(3);
        // // l1.print();
        // l1.addLast(4);
        // // l1.print();
        // l1.addMiddle(2,9);


        // only for last some Questions... 
        // l1.addLast(1);
        // l1.addLast(2);
        // l1.addLast(3);
        // l1.addLast(4);
        // l1.addLast(5);
        // l1.print();
        // System.out.println(l1.size);
        // l1.removeFirst();
        // l1.print();
        // l1.removeLast();
        // l1.print();
        // System.out.println(l1.itrSearch(3));
        // System.out.println(l1.itrSearch(10));
        // System.out.println(l1.recSearch(3));
        // System.out.println(l1.recSearch(10));
        // l1.print();
        // l1.reverse();
        // l1.print();
        
        // l1.deleteNthfromEnd(3);

        // <------ Palindrome --------->
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(2);
        l1.addLast(1);
        l1.print();
        System.out.println(l1.CheckPalindrome());

    }
}
