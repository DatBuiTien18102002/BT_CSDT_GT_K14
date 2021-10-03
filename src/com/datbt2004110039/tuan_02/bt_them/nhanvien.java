package com.datbt2004110039.tuan_02.bt_them;

public class nhanvien {
    String tenNhanVien;
    String luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;
    
    nhanvien(String tNV){
        tenNhanVien = tNV;
    }
    nhanvien(String tNV,String l){
        tenNhanVien = tNV;
        luong = l;
    }
    nhanvien(String tNV,String l,String dC,String bPLV,String nS){
        tenNhanVien = tNV;
        luong = l;
        diaChi = dC;
        boPhanLamViec = bPLV;
        ngaySinh = nS;
    }
}
