package com.datbt2004110039.tuan_04.bt_them;

public class mayTinh {
    String nhaSanXUat;
    String heDieuHanh;
    String Ram;
    String CPU;
    int gia;
    int namBaoHanh;
    mayTinh(String nSX,String hDH,String R,String cpu,int g,int nBH){
        nhaSanXUat = nSX;
        heDieuHanh = hDH;
        Ram = R;
        CPU = cpu;
        gia = g;
        namBaoHanh = nBH;
    }
    void inThongTin(){
        System.out.println("Nhà sản xuất:" + nhaSanXUat);
        System.out.println("Hệ điều hành:" + heDieuHanh);
        System.out.println("Ram:" + Ram);
        System.out.println("CPU:" + CPU);
        System.out.println("Giá:" + gia);
        System.out.println("Năm bảo hành:" + namBaoHanh);
    }
}
