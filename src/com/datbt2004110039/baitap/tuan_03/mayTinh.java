package com.datbt2004110039.baitap.tuan_03;

public class mayTinh {
    String nhaSanXUat;
    String heDieuHanh;
    String Ram;
    String CPU;
    int gia;
    int namBaoHanh;

    mayTinh(String nSX){
        nhaSanXUat = nSX;
    }
    mayTinh(String nSX , String hDH){
        nhaSanXUat = nSX;
        heDieuHanh = hDH ;
    }
    mayTinh(String nSX,String hDH,String R,String cpu,int g,int nBH){
        nhaSanXUat = nSX;
        heDieuHanh = hDH;
        Ram = R;
        CPU = cpu;
        gia = g;
        namBaoHanh = nBH;
    }
}
