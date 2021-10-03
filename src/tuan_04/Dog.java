package tuan_04;

public class Dog {
    int size;
    String name;
    String color;

    public Dog (){}

    public Dog(int s) {
        size = s;
    }

    public Dog(int s, String c, String n) {
        size = s;
        name = n;
        color = c;
    }

    void inThongTin() {
        System.out.println("Size " + size + " " + ", color = " + color + " " + ", name = " +" "+ name);
    }
}
