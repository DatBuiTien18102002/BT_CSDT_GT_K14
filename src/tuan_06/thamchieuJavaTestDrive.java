package tuan_06;

public class thamchieuJavaTestDrive {
    
    public static void main(String[] args) {
        thamchieuJava so1, so2;

        so1 = new thamchieuJava(5);

        so2 = new thamchieuJava(10);

        System.out.println("số 1: " + so1.number);
        System.out.println("số 2: " + so2.number);
        

        swap(so1, so2);

        System.out.println("số 1: " + so1.number);
        System.out.println("số 2: " + so2.number);
        

    }


    static void swap(thamchieuJava a, thamchieuJava b){
        int temp;
        temp = a.number;
        a.number = b.number;

        b.number = temp;
        
    }
}
