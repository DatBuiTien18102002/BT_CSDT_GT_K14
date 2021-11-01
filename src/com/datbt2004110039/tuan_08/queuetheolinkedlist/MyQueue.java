package com.datbt2004110039.tuan_08.queuetheolinkedlist;

public class MyQueue {
    Node head = null;
    Node tail = null;

    void myPush(taikhoan data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }

    }

    taikhoan myPeek(){
        return head.data;
    }

    taikhoan myPop(){
        Node current = head;
        taikhoan temp = current.data;
        head = current.next;
        


        return temp;
    }

    void intDanhSach(){
        Node current = head;

        while(current != null){
            current.data.inThongTin();
            current = current.next;
        }
    }

}
