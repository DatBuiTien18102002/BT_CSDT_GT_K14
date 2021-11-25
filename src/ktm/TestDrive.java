package ktm;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhập số lượng hàng hóa : ");
        int n = sc.nextInt();
        Commodity[] dshang = new Commodity[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm " + i);

            System.out.print("Mã hàng: ");
            int maHang = sc.nextInt();
            sc.nextLine();
            System.out.print("Tên hàng:");
            String tenHang = sc.nextLine();
            System.out.println("Loại: ");

            System.out.println("     1.Thực phẩm");
            System.out.println("     2.Sành sứ");
            System.out.println("     3.Hàng hóa");
            System.out.print("Lựa chọn: ");
            int luaChon = sc.nextInt();
            String loai = null;
            switch (luaChon) {
            case (1):
                
                loai = "Thực phẩm";
                break;
            case (2):
                loai = "Sành sứ";
                break;
            case (3):
                loai = "Hàng hóa";
                break;
            }
            sc.nextLine();
            System.out.print("Giá nhập: ");
            int giaNhap = sc.nextInt();
            System.out.print("Số lượng tồn kho: ");
            int sLTonKho = sc.nextInt();
            sc.nextLine();
            System.out.print("Ngày nhập kho(dd/mm/yyy): ");
            Date ngayNhap = null;
            try {
                ngayNhap = sdf.parse(sc.nextLine());
            } catch (Exception e) {
            }

            dshang[i] = new Commodity(maHang, tenHang, loai, giaNhap, sLTonKho, ngayNhap);
        }


        System.out.println("=== Số lượng sản phẩm : "+n+" ===");
        System.out.println("**********************************************Danh sách hàng hóa***********************************************");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-27s %-15s %-15s %-20s %-20s  \n","Mã hàng","Tên hàng hóa","Loại",
        "Giá nhập","Số lượng tồn kho","Ngày nhập kho");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            dshang[i].inThongTin();
        }
        System.out.println("***************************************************************************************************************");

    }
}
