package com.datbt2004110039.tuan_08.queuetheolinkedlist;

public class taikhoanTestDrive {
    public static void main(String[] args) {
        MyQueue dsTaiKhoan = new MyQueue();

        dsTaiKhoan.myPush(new taikhoan("Bùi Tiến Đạt",21456,"4000vnd"));
        dsTaiKhoan.myPush(new taikhoan("Lê THị Tuyết",61456,"5000vnd"));
        dsTaiKhoan.myPush(new taikhoan("Nguyễn Duy",81456,"10000vnd"));
        dsTaiKhoan.myPush(new taikhoan("Bùi Như Ý",91456,"98000vnd"));

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
