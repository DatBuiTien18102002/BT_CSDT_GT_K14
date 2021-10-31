package com.datbt2004110039.tuan_08.stacktheolinkedlist;

public class MyStack {
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
        return tail.data;
    }

    taikhoan myPop(){
        Node before = head;
        Node current = before.next;
        taikhoan temp ;
        if(current == null){
            temp = head.data;
            head = null;
            return temp;
        }

        while (current != null) {
            if(current.next == null){
                temp = current.data;
                before.next = null;
                tail = before;
                return temp;
            }
            before = before.next;
            current = before.next;

        }

        return null;
    }

    void intDanhSach(){
        Node current = head;

        while(current != null){
            current.data.inThongTin();
            current = current.next;
        }
    }

}
