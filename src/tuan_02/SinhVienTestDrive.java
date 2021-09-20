package tuan_02 ;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sinhVien;//khai báo biến tên sinhVien tham chiếu đối tượng kiểu SinhVien

        sinhVien = new SinhVien();//Tạo Đối tượn sinh viên trong vùng nhớ Heap
        sinhVien.mssv = "12345";
        sinhVien.tenSinhVien = "Lê Văn Tèo";
        sinhVien.tuoi = 18;
        sinhVien.queQuan = "TPHCM";

        sinhVien.inThongTinSV();
    }
     
    
}
