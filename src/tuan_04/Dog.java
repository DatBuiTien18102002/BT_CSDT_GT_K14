package tuan_04;

public class Dog {
    public int size;
    public String name;
    public String color;

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
