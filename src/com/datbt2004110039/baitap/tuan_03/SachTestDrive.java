package com.datbt2004110039.baitap.tuan_03;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach thongTin;
        System.out.println("---------");
        thongTin = new Sach(100000);
        System.out.println("Giá:" + thongTin.gia);

        System.out.println("---------");
        thongTin = new Sach(100000, "Amak Book");
        System.out.println("Giá:" + thongTin.gia);
        System.out.println("Nhà xuất bản:" + thongTin.nhaXuatBan);

        System.out.println("---------");
        thongTin = new Sach(100000, "Amak Book", 2020, 150000, 2000, "Ligh Novel");
        System.out.println("Giá:" + thongTin.gia);
        System.out.println("Nhà xuất bản:" + thongTin.nhaXuatBan);
        System.out.println("Năm xuất bản:" + thongTin.namXuatBan);
        System.out.println("Giá bán:" + thongTin.giaBan);
        System.out.println("Số lượng:" + thongTin.soLuong);
        System.out.println("Loại:" + thongTin.loai);
    }
}
