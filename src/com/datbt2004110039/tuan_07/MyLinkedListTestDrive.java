package com.datbt2004110039.tuan_07;

import java.util.Scanner;

public class MyLinkedListTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(4);
        myLinkedList.add(8);
        myLinkedList.add(5);
        myLinkedList.add(6);

        myLinkedList.print();
        myLinkedList.addHead(10);
        System.out.println("Sau khi thêm đầu");
        myLinkedList.print();

        System.out.print("Nhập phần tử muốn thêm vào đằng trước : " );
        int x = sc.nextInt(); 

        System.out.print("Nhập phần tử muốn thêm : " );
        int newadd  = sc.nextInt();

        myLinkedList.findAddBefore(x, newadd);
        System.out.println("Danh sách sau khi thêm");
        myLinkedList.print();


        System.out.print("Nhập phần tử xóa  : " );
        int delete  = sc.nextInt();
        myLinkedList.remove(delete);
        System.out.println("Danh sách sau khi xóa");
        myLinkedList.print();

        System.out.println("Xóa đầu:");
        myLinkedList.removeHead();
        System.out.println("Danh sách sau khi xóa");
        myLinkedList.print();

        System.out.println("Xóa đuôi:");
        myLinkedList.removeTail();
        System.out.println("Danh sách sau khi xóa");
        myLinkedList.print();

        System.out.print("Nhập phần tử muốn sửa: ");
        int phanTu = sc.nextInt();
        System.out.print("Nhập nội dung sửa: ");
        int sua = sc.nextInt();
        myLinkedList.sua(phanTu, sua);
        System.out.println("Danh sách sau khi sửa phần tử ");
        myLinkedList.print();








    }
}
