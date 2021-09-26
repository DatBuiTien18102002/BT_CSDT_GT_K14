package tuan_03;

public class cowTestDrive {
    public static void main(String[] args) {
        cow Cow ;//cow() hàm tạo mặc định
        //Cow = new cow();
        Cow = new cow("15 kg");
        System.out.println("Weight:"+Cow.weight);
        Cow = new cow("25 kg");
        System.out.println("Weight:"+Cow.weight);
    }
}
