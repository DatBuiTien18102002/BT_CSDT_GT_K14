package tuan_09;

public class timkiemtheocaynhiphan {
    public static void main(String[] args) {
        int[] mang = new int[]{2,3,4,5,6,10};
        int x = 6;
        binarySearch(mang, x);
        int result = binarySearch(mang, x);

        if(result == -1)
            System.out.println("Không tìm thấy");
        else
            System.out.println("Timg thấy tại vị trí "+ result);
    }
    static int binarySearch(int arr[],int x){
        int l = 0 , r = arr.length - 1;
        while(l<=r){
            int m = l + (r-l)/2;

            if(arr[m] == x){
                return m ;
            }

            if(arr[m]<x)
                l = m +1;
            else
                r = m-1;
        }
        return -1;
    }
}
