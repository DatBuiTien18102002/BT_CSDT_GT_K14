package com.datbt2004110039.tuan_08.queuetheolinkedlist;
public class taikhoan {
    String tenChuTK;
    int soTK;
    String soDu;


    taikhoan(String ten , int sotk , String sodu){
        tenChuTK = ten;
        soTK = sotk;
        soDu = sodu;
    }

    void inThongTin() {
        System.out.println("Tên chủ tài khoản:" + tenChuTK);
        System.out.println("Số tài khoản:" + soTK);
        System.out.println("Số dư :" + soDu);

    }
}