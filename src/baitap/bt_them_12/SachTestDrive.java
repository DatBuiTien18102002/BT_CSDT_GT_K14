package baitap.bt_them_12;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach thongtin = new Sach();

        thongtin.gia = 100000;
        thongtin.giaBan = 150000;
        thongtin.loai = "Light Novel";
        thongtin.namXuatBan = 2020;
        thongtin.nhaXuatBan = "Amak Book";
        thongtin.soLuong = 2000;
        
        thongtin.inThongTinSach();

    }
}
