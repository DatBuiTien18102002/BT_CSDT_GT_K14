package com.datbt2004110039.tuan_02.bt_them;

public class nhanvienTestDrive {
    public static void main(String[] args) {
        nhanvien thongtin = new nhanvien();

        thongtin.tenNhanVien = "Bùi Tiến Đạt";
        thongtin.boPhanLamViec = "Phòng Ban";
        thongtin.diaChi = "125/2 Hòa Hưng";
        thongtin.luong = " 15 Triệu " ;
        thongtin.ngaySinh= "18/10/2002";
        
        thongtin.inThongTinNhanVien();
    }
}
