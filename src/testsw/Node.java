package testsw;

public class Node {
    int data;
    Node next;
    Node prev;

    Node(int Data){
        data = Data;
    }

    Node(int d ,Node n,Node p){
        data = d;
        next = n;
        prev = p;
    }
}
