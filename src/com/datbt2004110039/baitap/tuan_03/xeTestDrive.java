package com.datbt2004110039.baitap.tuan_03;

public class xeTestDrive {
    public static void main(String[] args) {
        xe thongTin;
        System.out.println("-------");
        thongTin = new xe("Bùi Tiến Đạt");
        System.out.println("Tên chủ xe:" + thongTin.tenChuXe);

        System.out.println("-------");
        thongTin = new xe("Bùi Tiến Đạt", "Yamaha");
        System.out.println("Tên chủ xe:" + thongTin.tenChuXe);
        System.out.println("Hãng sản xuất:" + thongTin.hangSanXuat);        

        System.out.println("-------");
        thongTin = new xe("Bùi Tiến Đạt", "Yamaha", "Xe máy", "15648", "4.2 Lít");
        System.out.println("Tên chủ xe:" + thongTin.tenChuXe);
        System.out.println("Hãng sản xuất:" + thongTin.hangSanXuat);
        System.out.println("Dòng xe:" + thongTin.dong);
        System.out.println("Giấy phép xe:" + thongTin.giayPhep);
        System.out.println("Dung tích xe:" + thongTin.dungTichXang);
    }
}
