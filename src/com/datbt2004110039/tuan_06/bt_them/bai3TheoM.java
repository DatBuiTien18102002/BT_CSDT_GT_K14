package com.datbt2004110039.tuan_06.bt_them;

public class bai3TheoM {
    String ten;
    int gia;

    bai3TheoM(String t, int g) {
        ten = t;
        gia = g;
    }

    void inThongTin() {
        System.out.println("Tên sản phẩm:" + ten);
        System.out.println("Giá sản phẩm:" + gia);
    }
}
