package com.datbt2004110039.tuan_09;

public class Apple {
    int ma;
    float khoiLuong;
    String mauSac;

    Apple(int id,float kL, String color){
        ma = id;
        khoiLuong = kL;
        mauSac = color;
    }

    void inThongTin(){
        System.out.println("Mã của táo : "+ma);
        System.out.println("Khối lượng của táo : "+ khoiLuong);
        System.out.println("Màu sắc trái táo : "+mauSac);
    }

}
