package tuan_02;

public class SinhVien {
    // 1. thuộc tính - attribute
    String mssv;
    String tenSinhVien;
    int tuoi;
    boolean gioiTinh;// false
    String queQuan;

    // 2. phương thức - method - function
    // <Kiểu trả về> <tên hàm> <(danh sách tham số)>{.......}
    void inThongTinSV() {
        System.out.println("Mã số sinh viên: " + mssv);
        System.out.println("Tên sinh viên :" + tenSinhVien);
        System.out.println("Tuổi sinh viên:" + tuoi);
        System.out.println("Giới tính sinh viên :" + gioiTinh);
        System.out.println("Quê quán sinh viên :" + queQuan);
    }
}