package com.datbt2004110039.tuan_09;

import java.util.Scanner;

import javax.security.auth.login.CredentialException;

public class FunctionApple {
    Node head = null;
    Node tail = null;
    int sL;

    FunctionApple(int soLuong) {
        sL = soLuong;
    }

    void addApple() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã quả táo :");
        int ma = sc.nextInt();
        System.out.print("Khối lượng quả táo : ");
        float kL = sc.nextFloat();
        sc.nextLine();
        System.out.print("Màu sắc quả táo : ");
        String color = sc.nextLine();

        addTail(new Apple(ma, kL, color));
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

    void NhapDSApple() {
        head = null;
        tail = null;

        for (int i = 0; i < sL; i++) {
            System.out.println("Quả táo " + i);
            addApple();
        }
    }

    void coppyData(Apple a, Apple b) {
        a.khoiLuong = b.khoiLuong;
        a.ma = b.ma;
        a.mauSac = b.mauSac;
    }

    void selection_TangDan() {
        Node current = head;
        Node after;
        Node smaller = new Node(new Apple(0, 0, "0"));

        int check;

        while (current != null) {
            check = 0;
            after = current.next;
            coppyData(smaller.data, current.data);
            while (after != null) {
                if (after.data.khoiLuong <= smaller.data.khoiLuong) {
                    coppyData(smaller.data, after.data);
                    check = 1;
                }
                after = after.next;
            }
            if (check == 1) {
                Node local = head;

                while (local != null) {
                    if (local.data.ma == smaller.data.ma) {
                        coppyData(local.data, current.data);
                    }
                    local = local.next;
                }
                coppyData(current.data, smaller.data);
            }

            current = current.next;
        }

    }

    void selection_GiamDan() {
        Node current = head;
        Node after;
        Node smaller = new Node(new Apple(0, 0, "0"));

        int check;

        while (current != null) {
            check = 0;
            after = current.next;
            coppyData(smaller.data, current.data);
            while (after != null) {
                if (after.data.khoiLuong >= smaller.data.khoiLuong) {
                    coppyData(smaller.data, after.data);
                    check = 1;
                }
                after = after.next;
            }
            if (check == 1) {
                Node local = head;

                while (local != null) {
                    if (local.data.ma == smaller.data.ma) {
                        coppyData(local.data, current.data);
                    }
                    local = local.next;
                }
                coppyData(current.data, smaller.data);
            }

            current = current.next;
        }

    }

    void bubble_TangDan() {
        Node current ;
        Node after ;
        int number = 0;
        Node temp = new Node(new Apple(0, 0, "0"));
        while (number <= sL - 2) {
            current = head;
            after = current.next;
            for (int i = 0; i < sL - 1 - number; i++) {
                if (current.data.khoiLuong > after.data.khoiLuong) {
                    coppyData(temp.data, current.data);
                    coppyData(current.data, after.data);
                    coppyData(after.data, temp.data);
                }
                current = current.next;
                after = current.next;
            }
            number++;
        }

    }

    void bubble_GiamDan() {
        Node current ;
        Node after ;
        int number = 0;
        Node temp = new Node(new Apple(0, 0, "0"));
        while (number <= sL - 2) {
            current = head;
            after = current.next;
            for (int i = 0; i < sL - 1 - number; i++) {
                if (current.data.khoiLuong < after.data.khoiLuong) {
                    coppyData(temp.data, current.data);
                    coppyData(current.data, after.data);
                    coppyData(after.data, temp.data);
                }
                current = current.next;
                after = current.next;
            }
            number++;
        }

    }

    int findvsMa(int ma){
        Node current  = head;
        int i = 0 ;
        while(current != null){
            if(current.data.ma == ma){
                return i;
            }
            current = current.next;
            i++;
        }
        return -1;
    }

    
    void findvsMau(String mau){
        Node current  = head;
        System.out.println("======Danh sách táo theo màu "+mau+"==========");
        while(current != null){
            if(current.data.mauSac.equals(mau)){
                current.data.inThongTin();
            }
            current = current.next;
        }
    }

    void findvsCanNang(){
        Node current  = head;
        System.out.println("========200g>Danh sách táo >0.5g=====");
        while(current != null){
            if(current.data.khoiLuong > 0.5 && current.data.khoiLuong < 200 ){
                current.data.inThongTin();
            }
            current = current.next;
            
        }
    }

    int findvsCayvsKL(int x){
        if(x<0.5 || x>200){
            return -1;
        }
        int l = 0 , r = sL- 1;
        
        while(l<=r){
            int m = l + (r-l)/2;
            Node current = head;
            for(int i =0; i< m;i++){
                current = current.next;
            }
            if(current.data.khoiLuong == x){
                return m ;
            }

            if(current.data.khoiLuong<x)
                l = m +1;
            else
                r = m-1;
        }
        return -1;

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

}
