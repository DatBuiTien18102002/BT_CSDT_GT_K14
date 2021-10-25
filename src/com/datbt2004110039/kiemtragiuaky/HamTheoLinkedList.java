package com.datbt2004110039.kiemtragiuaky;

import java.util.Scanner;

public class HamTheoLinkedList {
    Node head = null;
    Node tail = null;
    int sL;

    HamTheoLinkedList(int soLuong){
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

    void NhapDSApple(){
        Scanner sc = new Scanner(System.in);
        head = null;
        tail = null;

        for(int i = 0 ; i<sL; i++){
            System.out.println("Quả táo "+ i);
            System.out.print("Mã quả táo :");
            int ma = sc.nextInt();
            sc.nextLine();
            System.out.print("Khối lượng quả táo : ");
            String kL = sc.nextLine();
            System.out.print("Màu sắc quả táo : ");
            String color = sc.nextLine();

            addTail(new Apple(ma, kL, color));
        }
    }

    void themVaoCuoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin của quả táo muốn thêm vào cuối :");
        System.out.print("Mã quả táo :");
        int ma = sc.nextInt();
        sc.nextLine();
        System.out.print("Khối lượng quả táo : ");
        String kL = sc.nextLine();
        System.out.print("Màu sắc quả táo : ");
        String color = sc.nextLine();
        addTail(new Apple(ma, kL, color));
    }

    void themVaoDau(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin của quả táo muốn thêm vào đầu :");
        System.out.print("Mã quả táo :");
        int ma = sc.nextInt();
        sc.nextLine();
        System.out.print("Khối lượng quả táo : ");
        String kL = sc.nextLine();
        System.out.print("Màu sắc quả táo : ");
        String color = sc.nextLine();
        addHead(new Apple(ma, kL, color));
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

    void themApple(int viTri){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin quả táo cần thêm :");
        System.out.print("Mã quả táo :");
        int ma = sc.nextInt();
        sc.nextLine();
        System.out.print("Khối lượng quả táo : ");
        String kL = sc.nextLine();
        System.out.print("Màu sắc quả táo : ");
        String color = sc.nextLine();
        Node newNode = new Node(new Apple(ma, kL, color));

 
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

    void xoaTail(){
        Node before = head;
        Node current = before.next;

        while(current != null){
            if(current.next == null){
                before.next = null;
                return;
            }
            before = before.next;
            current = before.next;
        }

    }




}
