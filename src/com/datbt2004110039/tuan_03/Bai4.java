package com.datbt2004110039.tuan_03;

public class Bai4 {

    String hoTen;
    float diem;
    String hocLuc;

    public Bai4() {

    }

    public Bai4(String hT, float d, String hL) {
        hoTen = hT;
        diem = d;
        hocLuc = hL;
    }
    void inThongTin() {
        System.out.println("Họ tên:" + hoTen);
        System.out.println("Điểm:" + diem);
        System.out.println("Học Lực:" + hocLuc);
    }


}
