package doublylinked_SVGD;

public class Node {

    SVGD data;

    Node next;

    Node prev;

    Node() {

    }

    Node(SVGD d) {
        data = d;
    }

    Node(SVGD d, Node n , Node p) {
        data = d;
        next = n;
        prev = p;
    }
    

}
