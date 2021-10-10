package com.datbt2004110039.tuan_03.bt_them;

public class Sach {
    int gia;
    String nhaXuatBan;
    int namXuatBan;
    int giaBan;
    int soLuong;
    String loai;
    Sach(int g){
        gia = g;
    }

    Sach(int g,String nhaXB){
        gia = g;
        nhaXuatBan =nhaXB;
    }

    Sach(int g,String nhaXB,int namXB,int gB,int sL,String l){
        gia = g;
        nhaXuatBan =nhaXB;
        namXuatBan =namXB;
        giaBan =gB;
        soLuong =sL;
        loai = l;
    }
}
