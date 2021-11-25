package testsw;

public class MyDoublyLinked {
    Node head = null;
    Node tail = null;

    void add(int data){
        Node newNode = new Node(data);
        if(head == null){//thêm 1 nút vào danh sách
            head = newNode;
            tail = newNode;
        }else{// danh sách không rỗng // thêm vào đuôi danh sách
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            
        }
    }

    void print(){
        Node current = tail;
        if(current == null){
            System.out.println("Danh sách rỗng");
            return;
        }else
            while(current != null){
                System.out.println(current.data);
                current = current.prev;
            }
    }
}
