package tuan_09;

public class timKiem {
    public static void main(String[] args) {
        int[] mang = new int[]{3,2,4,5,6,10};
        int x = 10;
        search(mang, x);
        int result = search(mang, x);

        if(result == -1)
            System.out.println("Không tìm thấy");
        else
            System.out.println("Timg thấy tại vị trí "+ result);
    }
    
    public static int  search(int arr[],int x){
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]==x)
                return i+1;
        }
        return -1;
    }
}
