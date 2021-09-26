package com.datbt2004110039.baitap.tuan_03;

public class mayTinhTestDrive {
    public static void main(String[] args) {
        mayTinh thongtin;
        thongtin = new mayTinh("ASUS");
        System.out.println("Nhà sản suất: " + thongtin.nhaSanXUat);

        System.out.println("--------");
        thongtin = new mayTinh("ASUS", "Window 10");
        System.out.println("Nhà sản suất: " + thongtin.nhaSanXUat);
        System.out.println("Hệ điều hành: " + thongtin.heDieuHanh);
        System.out.println("--------");
        thongtin = new mayTinh("ASUS", "Window 10", "16GB", "Intel core i7", 18000000, 3);
            System.out.println("Nhà sản suất: " + thongtin.nhaSanXUat);
            System.out.println("Hệ điều hành: " + thongtin.heDieuHanh);
            System.out.println("Ram:" + thongtin.Ram);
            System.out.println("CPU:" + thongtin.CPU);
            System.out.println("Giá:" + thongtin.gia);
            System.out.println("Năm bảo hành:" + thongtin.namBaoHanh);        
    }
}
