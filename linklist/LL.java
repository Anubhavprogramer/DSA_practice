public class LL 
{
    Node head;  //!creating the first node i.e head node
    class Node {
        String data;  //*node data which is to be stored
        Node next;   //address of the next node will be stored here
        Node(String data)  // @param data parametrised constructor that actualy created a node
        {
            this.data = data;  // ? data which will come from the user will be stored here to the current list 
            this.next = null;  // initially the every note has the null address
        }
    }
    //Function to add data to the first of the linklist
    public void addfirst(String data)
    {
        //creating a new node 
        Node newNode = new Node(data);
        if(head == null)// ?check if the head is null or not  
        {
            //if the node is null
            head = newNode;  //head will store a new node
            return;//return
        }
        //if the node is note null
        //then newNode ka next head me store ho jayega  
        newNode.next=head;
        //and head me newnode ko dal denge
        head = newNode;
    }


    //* add at the last */
    public void addLast(String data)
    {
        Node newNode = new Node(data); //*create a new node to store the data */
        if(head == null)  //?id head is equalto null
        {
            // add the new node to head
            head = newNode;
            return;
        }
        //*we are creating a new node just to traverse threw the whole linked list */
        Node curnode = head;
        while (curnode.next != null) {
            curnode= curnode.next;
        }
        // at this point we have the value of the last node of the linklist and than we will add the new node to it
        curnode.next = newNode;
    }


    // print list

    public void printlist()
    {
        //to print the list just traverse thre the list and print it

        Node currNode= head;
        while (currNode != null) {
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }

        System.out.println("NULL");

    }

    // to delete the node of the linklist 
    // delete at first
    public void deletefirst(){
        if(head == null){
            System.out.println("The list is empty ");
        }
        head = head.next;
    }

    //delete at last
    public static void main(String[] args) {
        LL newNode = new LL();

        newNode.addfirst("radhe");
        newNode.addLast("krishna");
        newNode.printlist();
    }
}