package com.datbt2004110039.tuan_07.LinkedList_SVGD;

public class Node {
    // Nội dung
    SVGD data;
    // Liên kết đến nút tiếp theo
    // Tham chiếu
    Node next;// Biến tham chiếu kiểu node

    Node() {

    }

    Node(SVGD d) {
        data = d;
    }

    Node(SVGD d, Node n) {
        data = d;
        next = n;
    }
    

}
