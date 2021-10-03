package com.datbt2004110039.tuan_03.bt_them;

public class taikhoan {
    String tenChuTK;
    int soTK;
    int soDu;

    taikhoan(String tCTK,int sTK,int sD){
        tenChuTK = tCTK;
        soTK = sTK;
        sD = soDu;
    }
    void inThongTin() {
        System.out.println("Tên chủ tài khoản:" + tenChuTK);
        System.out.println("Số tài khoản:" + soTK);
        System.out.println("Số dư" + soDu);

    }
}
