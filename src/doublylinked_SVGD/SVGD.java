package doublylinked_SVGD;

import java.util.Scanner;

public class SVGD{
    public int maSV;
    public String hoTen;
    public String ngaySinh;
    public float diem;
    public String hocLuc;
    public int soSV;

    public SVGD(int mSV, String hT, String nS,float d,String hL){
        maSV = mSV;
        hoTen = hT;
        ngaySinh = nS;
        diem = d;
        hocLuc = hL;

    }
    SVGD(){
        
    }
    public SVGD(int n){
        soSV = n;
    }

    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã số sinh viên: ");
        int maSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Họ và Tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Ngày sinh: ");
        String ngaySinh = sc.nextLine();
        System.out.print("Điểm: ");
        float diem = sc.nextFloat();
        sc.nextLine();
    }

    void inThongTin(){
        System.out.printf("%-15d %-20s %-15s %-10.2f %-20s \n", maSV, hoTen, ngaySinh,
        diem,hocLuc);
    }
}
