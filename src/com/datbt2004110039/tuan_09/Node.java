package com.datbt2004110039.tuan_09;

public class Node {
    Apple data;
 
    Node next;

    Node() {

    }

    Node(Apple d) {
        data = d;
    }

    Node(Apple d, Node n) {
        data = d;
        next = n;
    }
}
