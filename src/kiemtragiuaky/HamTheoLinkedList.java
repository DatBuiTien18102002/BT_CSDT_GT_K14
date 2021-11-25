package kiemtragiuaky;

import java.util.Scanner;

public class HamTheoLinkedList {
    Node head = null;
    Node tail = null;
    int sL;

    HamTheoLinkedList(int soLuong) {
        sL = soLuong;
    }

    void addTail(Apple data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    void addHead(Apple data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
    }

    void NhapDSApple() {
        Scanner sc = new Scanner(System.in);
        head = null;
        tail = null;

        for (int i = 0; i < sL; i++) {
            Apple Tao = new Apple();
            Tao.nhapThongTin();
            addTail(Tao);
        }
    }

    void themVaoCuoi() {
        Apple Tao = new Apple();
        Tao.nhapThongTin();
        addTail(Tao);
    }

    void themVaoDau() {
        Apple Tao = new Apple();
        Tao.nhapThongTin();
        addHead(Tao);
    }

    boolean find(int tim) {
        Node current = head;

        while (current != null) {
            if (current.data.ma == tim) {
                return true;
            }
            current = current.next;
        }
        return false;

    }

    void inDanhSach() {
        int i = 0;
        Node current = head;
        if (current == null) {
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("=====Danh sách táo=====");
        while (current != null) {
            System.out.println("Quả táo " + i);
            current.data.inThongTin();
            current = current.next;
            i++;
        }
        System.out.println("=======================");

    }

    void themApple(int viTri) {
        Apple Tao = new Apple();
        Tao.nhapThongTin();
        Node newNode = new Node(Tao);

        Node before = head;

        Node current = before.next;

        while (current != null) {
            if (current.data.ma == viTri) {
                before.next = newNode;
                newNode.next = current;
                return;

            }
            before = before.next;
            current = before.next;

        }
    }

    void xoaTail() {
        Node before = head;
        Node current = before.next;

        while (current != null) {
            if (current.next == null) {
                before.next = null;
                tail = before;
                return;
            }
            before = before.next;
            current = before.next;
        }

    }
}
