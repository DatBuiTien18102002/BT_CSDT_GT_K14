package com.datbt2004110039.tuan_08.stacktheolinkedlist;

public class Node {
    // Nội dung
    taikhoan data;
    // Liên kết đến nút tiếp theo
    // Tham chiếu
    Node next;// Biến tham chiếu kiểu node

    Node() {

    }

    Node(taikhoan d) {
        data = d;
    }

    Node(taikhoan d, Node n) {
        data = d;
        next = n;
    }

    
    

}
