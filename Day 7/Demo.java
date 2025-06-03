import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int k = 5;
        // ! Brute force approach
        // for (int j = 0; j < k; j++) {
        // int first = a[0];
        // int n = a.length;
        // for (int i = 0; i < n - 1; i++) {
        // a[i] = a[i + 1];
        // }
        // a[a.length - 1] = first;
        // }
        // ! Time complexity :O(n^2)
        Rotateleft(a, k);

        System.out.println(Arrays.toString(a));

    }

    public static void Rotateleft(int a[], int k) {
        int n = a.length;
        reverse(0, k-1, a);
        reverse(k, n-1, a);
        reverse(0, n-1, a);
    }

    public static void reverse(int start, int end, int a[]) {
        while(start<=end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
