
import java.util.Scanner;

public class bai3TheoMTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        bai3TheoM[] sanPham = new bai3TheoM[n];
        int luaChon;
        do {
            System.out.println("=====================Menu================");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Thêm vào danh sách sản phẩm ở vị trí bất kì");
            System.out.println("6. Kết thúc");
            System.out.println("=========================================");
            System.out.print("Lựa chọn :");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sản phẩm " + i);
                        System.out.print("Nhập tên sản phẩm:");
                        String ten = sc.nextLine();
                        System.out.print("Nhập giá sản phẩm:");
                        int gia = sc.nextInt();
                        sc.nextLine();
                        sanPham[i] = new bai3TheoM(ten, gia);
                    }

                    break;
                case 2:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++)
                            if (sanPham[i].gia < sanPham[j].gia) {
                                String tempt;
                                tempt = sanPham[i].ten;
                                sanPham[i].ten = sanPham[j].ten;
                                sanPham[j].ten = tempt;
                                int tempg;
                                tempg = sanPham[i].gia;
                                sanPham[i].gia = sanPham[j].gia;
                                sanPham[j].gia = tempg;

                            }
                    }

                    System.out.println("============Danh sách sản phẩm ban đầu==========");
                    for (int i = 0; i < n; i++) {
                        System.out.println("====Sản phẩm " + i+"====");
                        sanPham[i].inThongTin();
                    }
                    break;

                case 3:
                    int viTri = 0;
                    int dem = 0;
                    bai3TheoM xoaSanPham[] = new bai3TheoM[n - 1];
                    sc.nextLine();
                    System.out.print("Nhập tên sản phẩm cần xóa theo danh sách ban đầu: ");
                    String xoa = sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        if (xoa.equals(sanPham[i].ten) == true) {
                            viTri = i;
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        if (i == viTri) {
                            continue;
                        }
                        xoaSanPham[dem] = sanPham[i];
                        dem++;
                    }
                    System.out.println("============Danh sách sản phẩm sau khi xóa==========");
                    for (int i = 0; i < n - 1; i++) {
                        System.out.println("====Sản phẩm " + i+"====");
                        xoaSanPham[i].inThongTin();
                    }
                    break;
                case 4:
                    int s = 0;
                    for (int i = 0; i < sanPham.length; i++) {
                        s += sanPham[i].gia;
                    }
                    int giaTB = s / sanPham.length;
                    System.out.println("Giá trung bình của các sản phẩm theo danh sách ban đầu là:" + giaTB);

                    break;
                case 5:
                    bai3TheoM[] themSanPham = new bai3TheoM[n + 1];
                    System.out.print("Nhập vị trí muốn thêm của mảng theo danh sách ban đầu: ");
                    int viTriThem = sc.nextInt();
                    sc.nextLine();
                    dem = 0;
                    if (viTriThem == sanPham.length) {
                        for (int i = 0; i < n; i++) {
                            themSanPham[dem] = sanPham[i];
                        }
                        System.out.print("Nhập tên sản phẩm:");
                        String ten = sc.nextLine();
                        System.out.print("Nhập giá sản phẩm:");
                        int gia = sc.nextInt();
                        sc.nextLine();
                        themSanPham[viTriThem] = new bai3TheoM(ten, gia);
                    }
                    for (int i = 0; i < sanPham.length; i++) {
                        if (i == viTriThem) {
                            System.out.print("Nhập tên sản phẩm:");
                            String ten = sc.nextLine();
                            System.out.print("Nhập giá sản phẩm:");
                            int gia = sc.nextInt();
                            sc.nextLine();
                            themSanPham[viTriThem] = new bai3TheoM(ten, gia);
                            dem++;
                        }
                        themSanPham[dem] = sanPham[i];
                        dem++;
                    }
                    System.out.println("============Danh sách sản phẩm sau khi thêm==========");
                    for (int i = 0; i < themSanPham.length; i++) {
                        System.out.println("====Sản phẩm " + i+"====");
                        themSanPham[i].inThongTin();
                    }

                    break;

            }

        } while (luaChon != 6);
    }
}
