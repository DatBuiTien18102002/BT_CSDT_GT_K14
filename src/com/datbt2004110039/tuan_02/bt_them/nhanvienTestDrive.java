package com.datbt2004110039.tuan_02.bt_them;

public class nhanvienTestDrive {
    public static void main(String[] args) {
        nhanvien thongTin;
        thongTin = new nhanvien("Bùi Tiến Đạt");
        System.out.println("Tên nhân viên:" + thongTin.tenNhanVien);

        System.out.println("-------");
        thongTin = new nhanvien("Bùi Tiến Đạt", "15 triệu");
        System.out.println("Tên nhân viên:" + thongTin.tenNhanVien);
        System.out.println("Lương:" + thongTin.luong);

        System.out.println("-------");
        thongTin = new nhanvien("Bùi Tiến Đạt", "15 triệu", "125/2 Hòa Hưng", "Phòng Ban", "18/10/2002");
        System.out.println("Tên nhân viên:" + thongTin.tenNhanVien);
        System.out.println("Lương:" + thongTin.luong);
        System.out.println("Địa chỉ:" +thongTin.diaChi);
        System.out.println("Bộ phận làm việc:" + thongTin.boPhanLamViec);
        System.out.println("Ngày sinh:" + thongTin.ngaySinh);
    }
}
