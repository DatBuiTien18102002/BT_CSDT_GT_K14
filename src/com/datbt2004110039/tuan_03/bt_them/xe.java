package com.datbt2004110039.tuan_03.bt_them;

public class xe {
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    String dungTichXang;

    xe(String tCX, String hSX, String d, String gP, String dTX) {
        tenChuXe = tCX;
        hangSanXuat = hSX;
        dong = d;
        giayPhep = gP;
        dungTichXang = dTX;
    }
    void inThongTin() {
        System.out.println("Tên chủ xe:" + tenChuXe);
        System.out.println("Hãng sản xuất:" + hangSanXuat);
        System.out.println("Dòng xe:" + dong);
        System.out.println("Giấy phép xe:" + giayPhep);
        System.out.println("Dung tích xăng:" + dungTichXang);

    }
}
