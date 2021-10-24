package com.datbt2004110039.tuan_07;

public class Node {
    // Nội dung
    int data;
    // Liên kết đến nút tiếp theo
    // Tham chiếu
    Node next;// Biến tham chiếu kiểu node

    Node() {

    }

    Node(int d) {
        data = d;
    }

    Node(int d, Node n) {
        data = d;
        next = n;
    }
    

}
