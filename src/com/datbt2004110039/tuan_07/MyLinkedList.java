package com.datbt2004110039.tuan_07;

public class MyLinkedList {
    Node head = null;// danh sách rỗng
    Node tail = null;

    void add(int data) {
        // Tạo node mới

        Node newNode = new Node(data);
        if (head == null) {// thêm 1 nút vào danh sách
            head = newNode;
            tail = newNode;
        } else {// danh sách không rỗng // thêm vào đuôi danh sách
            tail.next = newNode;
            tail = newNode;

        }

    }

    void addHead(int data) {

        Node newNode = new Node(data);
        if (head == null) {// thêm 1 nút vào danh sách
            head = newNode;
            tail = newNode;
        } else {// danh sách không rỗng // thêm vào đuôi danh sách
            newNode.next = head;
            head = newNode;

        }

    }

    void print() {
        Node current = head;
        if (current == null) {
            System.out.println("Danh sách rỗng");
            return;
        } else
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
    }

    boolean find(int tim) {
        Node current = head;
        if (current == null) {
            System.out.println("Danh sách rỗng");
            return false;
        } else
            while (current != null) {
                if (tim == current.data)
                    return true;
                current = current.next;
            }
        return false;
    }

    void findAddBefore(int tim, int them) {
        Node newNode = new Node(them);

        if (find(tim) == false) {
            System.out.println("Phần tử không tồn tại");
            return;
        }
        Node before = head;

        Node current = before.next;

        if (before.data == tim) {
            addHead(them);
            return;

        }

        while (current != null) {
            if (current.data == tim) {
                before.next = newNode;
                newNode.next = current;
                return;

            }
            before = before.next;
            current = before.next;

        }
    }

    void removeHead(){
        head = head.next;
    }

    void removeTail(){

        Node before = head;
        Node current = before.next;
        if(before.next == null){
            removeHead();
            return;
        }

        while (current != null) {
            if(current.next == null){
                before.next = null;
                return;
            }
            before = before.next;
            current = before.next;

        }

    }

    void remove(int delete){
        if (find(delete) == false) {
            System.out.println("Phần tử không tồn tại");
            return;
        }

        if (delete == head.data) {
            removeHead();
            return;
        }

        if (delete == tail.data) {
            removeTail();
            return;
        }

        Node before = head;

        Node current = before.next;

        Node after = current.next;


     
        while (after != null) {
            if (current.data == delete) {
                before.next = after;
                return;

            }
            before = before.next;
            current = before.next;
            after = current.next;

        }
        
    }

    void sua(int phanTu,int sua){
        Node current = head;
        if (current == null) {
            System.out.println("Danh sách rỗng");
            return;
        } else
            while (current != null) {
                if(current.data == phanTu){
                    current.data = sua ;
                    return;
                }
                current = current.next;
            } 
    }

    // tail.next = null; giá trị cuối cùng

}
