package com.datbt2004110039.tuan_04;

public class Bai3 {
    String ten;
    int gia;
    Bai3(String t,int g){
        ten = t;
        gia= g;

    }
    void inThongTin(){
        System.out.println("Tên sản phẩm:" + ten);
        System.out.println("Giá sản phẩm:" + gia);
    }
}
