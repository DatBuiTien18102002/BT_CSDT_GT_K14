package com.datbt2004110039.tuan_03.bt_them;

public class taikhoanTestDrive {
    public static void main(String[] args) {
        taikhoan thongTin;
        System.out.println("---------");
        thongTin = new taikhoan("Bùi Tiến Đạt");
        System.out.println("Tên chủ tài khoản:" + thongTin.tenChuTK);

        System.out.println("---------");
        thongTin = new taikhoan("Bùi Tiến Đạt", 10567856);
        System.out.println("Tên chủ tài khoản:" + thongTin.tenChuTK);
        System.out.println("Số tài khoản:" + thongTin.soTK);

        System.out.println("---------");
        thongTin = new taikhoan("Bùi Tiến Đạt", 10567856, 1000000);
        System.out.println("Tên chủ tài khoản:" + thongTin.tenChuTK);
        System.out.println("Số tài khoản:" + thongTin.soTK);
        System.out.println("Số dư" + thongTin.soDu);

    }
}
