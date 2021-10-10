package com.datbt2004110039.tuan_04.bt_them;

public class Sach {
    int gia;
    String nhaXuatBan;
    int namXuatBan;
    int giaBan;
    int soLuong;
    String loai;
    Sach(int g,String nhaXB,int namXB,int gB,int sL,String l){
        gia = g;
        nhaXuatBan =nhaXB;
        namXuatBan =namXB;
        giaBan =gB;
        soLuong =sL;
        loai = l;
    }
    void inThongTin() {
        System.out.println("Giá:" + gia);
        System.out.println("Nhà xuất bản:" + nhaXuatBan);
        System.out.println("Năm xuất bản:" + namXuatBan);
        System.out.println("Giá bán:" + giaBan);
        System.out.println("Số lượng:" + soLuong);
        System.out.println("Loại:" + loai);
        
    }
}
