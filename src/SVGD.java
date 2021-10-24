

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
    public SVGD(int n){
        soSV = n;
    }
    void inThongTin(){
        System.out.printf("%-15d %-20s %-15s %-10.2f %-20s \n", maSV, hoTen, ngaySinh,
        diem,hocLuc);
    }
}
