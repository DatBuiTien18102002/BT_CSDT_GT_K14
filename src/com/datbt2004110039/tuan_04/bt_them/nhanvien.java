package com.datbt2004110039.tuan_04.bt_them;

public class nhanvien {
    String tenNhanVien;
    String luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;

    nhanvien(String tNV,String l,String dC,String bPLV,String nS){
        tenNhanVien = tNV;
        luong = l;
        diaChi = dC;
        boPhanLamViec = bPLV;
        ngaySinh = nS;
    }
    void inThongTin() {
        System.out.println("Tên nhân viên:" + tenNhanVien);
        System.out.println("Lương:" + luong);
        System.out.println("Địa chỉ:" + diaChi);
        System.out.println("Bộ phận làm việc:" + boPhanLamViec);
        System.out.println("Ngày sinh:" + ngaySinh);

    }
}
