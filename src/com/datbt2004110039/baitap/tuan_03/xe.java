package com.datbt2004110039.baitap.tuan_03;

public class xe {
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    String dungTichXang;

    xe(String tCX) {
        tenChuXe = tCX;
    }

    xe(String tCX, String hSX) {
        tenChuXe = tCX;
        hangSanXuat = hSX;
    }

    xe(String tCX, String hSX, String d, String gP, String dTX) {
        tenChuXe = tCX;
        hangSanXuat = hSX;
        dong = d;
        giayPhep = gP;
        dungTichXang = dTX;
    }
}
