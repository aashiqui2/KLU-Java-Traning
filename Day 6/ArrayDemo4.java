import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int a[] = { 4, 33, 29, 1, 5 };
        // //! brute force approach
        // Arrays.sort(a);
        // //! quick sort-O(n*logn)
        // System.out.println(a[a.length - 1]);
        // System.out.println(a[0]);
        
        //! optimal approach
        int max = a[0];
        int min=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        // time complexity:O(n)
        System.out.println("Maximum"+max);
        System.out.println("Minimum"+min);
    }
}
