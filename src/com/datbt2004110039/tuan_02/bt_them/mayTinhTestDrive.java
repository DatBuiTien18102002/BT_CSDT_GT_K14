package com.datbt2004110039.tuan_02.bt_them;

public class mayTinhTestDrive {
    public static void main(String[] args) {
        mayTinh thongtin = new mayTinh();

        thongtin.nhaSanXUat = "ASUS";
        thongtin.gia = 18000000;
        thongtin.CPU = "Intel Core i7";
        thongtin.Ram = " 16 GB " ;
        thongtin.heDieuHanh= "Window 10";
        thongtin.namBaoHanh= 3;
        
        thongtin.inThongTinMayTInh();
    }
}
