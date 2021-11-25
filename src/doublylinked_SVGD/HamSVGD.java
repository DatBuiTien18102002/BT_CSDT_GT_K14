package doublylinked_SVGD;
import java.util.Scanner;



public class HamSVGD {
    Node head = null;// danh sách rỗng
    Node tail = null;
    int sL;

    HamSVGD(int sl) {
        sL = sl;
    }

    void add(SVGD data) {
        // Tạo node mới

        Node newNode = new Node(data);
        if (head == null) {// thêm 1 nút vào danh sách
            head = newNode;
            tail = newNode;
        } else {// danh sách không rỗng // thêm vào đuôi danh sách
            tail.next = newNode;
            tail = newNode;

        }

    }

    String xetHocLuc(float diem) {
        if (diem >= 9) {
            return "Xuất sắc";
        } else if (diem >= 7.5) {
            return "Giỏi";
        } else if (diem >= 6.5) {
            return "Khá";
        } else if (diem >= 5) {
            return "Trung Bình";
        } else
            return "Yếu";
    }

    void nhapDSSV() {
        Scanner sc = new Scanner(System.in);
        head = null;
        tail = null;
        for (int i = 0; i < sL; i++) {
            System.out.println("Sinh viên " + (i + 1) + ": ");
            SVGD newSV = new SVGD();
            newSV.nhapThongTin();
            newSV.hocLuc = xetHocLuc(newSV.diem);

            add(newSV);

        }
    }

    void addHead(SVGD data) {

        Node newNode = new Node(data);
        if (head == null) {// thêm 1 nút vào danh sách
            head = newNode;
            tail = newNode;
        } else {// danh sách không rỗng // thêm vào đuôi danh sách
            newNode.next = head;
            head = newNode;

        }

    }

    void inListSinhVien() {
        // In danh sách sinh viên
        Node current = head;
        if (current == null) {
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.printf("%-15s %-20s %-15s %-10s %-20s\n", "Mã Sinh Viên", "Họ và tên", "Ngày sinh", "Điểm",
                "Học lực");
        while (current != null) {
            current.data.inThongTin();
            current = current.next;
        }

    }

    void sapXepSV() {
        Node current = head;
        float temp;

        if (current == null) {
            System.out.println("Danh sách rỗng");
            return;
        } else {
            Node after;
            while (current != null) {
                after = current.next;
                while (after != null) {
                    if (current.data.diem < after.data.diem) {
                        temp = current.data.diem;
                        current.data.diem = after.data.diem;
                        after.data.diem = temp;
                        current.data.hocLuc = xetHocLuc(current.data.diem);
                        after.data.hocLuc = xetHocLuc(after.data.diem);
                    }
                    after = after.next;
                }
                current = current.next;
            }
        }
        inListSinhVien();
    }

    void find(String tim) {
        Node current = head;
        if (current == null) {
            System.out.println("Danh sách rỗng");
        } else
            while (current != null) {
                if (current.data.hoTen.equals(tim)) {
                    System.out.println("=======");
                    System.out.printf("%-15s %-20s %-15s %-10s %-20s\n", "Mã Sinh Viên", "Họ và tên", "Ngày sinh", "Điểm",
                    "Học lực");
                    current.data.inThongTin();
                    System.out.println("=======");
                    return;
                }
                current = current.next;
            }

    }

    void removeHead() {
        head = head.next;
    }

    void removeTail() {

        Node before = head;
        Node current = before.next;
        if (before.next == null) {
            removeHead();
            return;
        }

        while (current != null) {
            if (current.next == null) {
                before.next = null;
                tail = before;
                return;
            }
            before = before.next;
            current = before.next;

        }

    }

    void remove(String delete) {
        if (head.data.hoTen.equals(delete)) {
            removeHead();
            return;
        }

        if (tail.data.hoTen.equals(delete)) {
            removeTail();
            return;
        }

        Node before = head;

        Node current = before.next;

        Node after = current.next;

        while (after != null) {
            if (current.data.hoTen.equals(delete)) {
                before.next = after;
                return;

            }
            before = before.next;
            current = before.next;
            after = current.next;

        }
        System.out.println("Tên nhập vào không tồn tại");

    }

    void sua(String phanTu, int luaChon) {
        Scanner sc = new Scanner(System.in);
        Node current = head;
        if (current == null) {
            System.out.println("Danh sách rỗng");
            return;
        } else
            while (current != null) {
                if (current.data.hoTen.equals(phanTu)) {
                    switch (luaChon) {
                    case 1:
                        System.out.print("Nhập mã số mới:");
                        int newMaSV = sc.nextInt();
                        current.data.maSV = newMaSV;
                        break;
                    case 2:
                        System.out.print("Nhập họ tên mới:");
                        String newHoTen = sc.nextLine();
                        current.data.hoTen = newHoTen;
                        break;
                    case 3:
                        System.out.print("Nhập ngày sinh mới :");
                        String newNS = sc.nextLine();
                        current.data.ngaySinh = newNS;
                        break;
                    case 4:
                        System.out.print("Nhập điểm mới:");
                        Float newDiem = sc.nextFloat();
                        current.data.diem = newDiem;
                        current.data.hocLuc = xetHocLuc(newDiem);
                        break;

                    }
                    return;
                }
                current = current.next;
            }
        System.out.println("Tên nhập vào  không tồn tại");
    }

}
