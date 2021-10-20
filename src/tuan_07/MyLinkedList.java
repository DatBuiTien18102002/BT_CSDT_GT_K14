package tuan_07;

public class MyLinkedList {
    Node head = null;// danh sách rỗng
    Node tail = null;

    void add(int data){
        //Tạo node mới

        Node newNode = new Node(data);
        if(head == null){//thêm 1 nút vào danh sách
            head = newNode;
            tail = newNode;
        }else{// danh sách không rỗng // thêm vào đuôi danh sách
            tail.next = newNode;
            tail = newNode;
            
        }


    }
    void print(){
        Node current = head;
        if(current == null){
            System.out.println("Danh sách rỗng");
            return;
        }else
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
    }
    //tail.next = null; giá trị cuối cùng


}
