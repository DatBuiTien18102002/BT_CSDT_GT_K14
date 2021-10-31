package com.datbt2004110039.tuan_08.stacktheolinkedlist;

public class taikhoanTestDrive {
    public static void main(String[] args) {
        MyStack dsTaiKhoan = new MyStack();

        dsTaiKhoan.myPush(new taikhoan("Bùi Tiến Đạt",21456,"4000vnd"));
        dsTaiKhoan.myPush(new taikhoan("Bùi 7t",21456,"5000vnd"));
        dsTaiKhoan.myPush(new taikhoan("Bùi T9t",21456,"10000vnd"));
        dsTaiKhoan.myPush(new taikhoan("Bùi T78ạt",21456,"98000vnd"));

        dsTaiKhoan.intDanhSach();
        
        taikhoan popped = dsTaiKhoan.myPop();
        System.out.println("============Đã lấy ra phần tử :");
        System.out.println("Tên tài khoản :" + popped.tenChuTK);
        System.out.println("Số tài khoản :" + popped.soTK);
        System.out.println("Số dư :" + popped.soDu);

        System.out.println("===========Danh sách sau khi lấy ra============");

        dsTaiKhoan.intDanhSach();

        taikhoan phanTuDuocTham = dsTaiKhoan.myPeek();
        System.out.println("============Thăm phần tử :");
        System.out.println("Tên tài khoản :" + phanTuDuocTham.tenChuTK);
        System.out.println("Số tài khoản :" + phanTuDuocTham.soTK);
        System.out.println("Số dư :" + phanTuDuocTham.soDu);

        System.out.println("===========Danh sách sau khi thăm============");

        dsTaiKhoan.intDanhSach();


    }
}
