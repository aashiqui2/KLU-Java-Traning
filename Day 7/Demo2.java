public class Demo2 {
    public static void main(String[] args) {
        int a[] = { 5,4,3,2,1};
        if (issorted(a)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean issorted(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[n - 1]) {
                if (a[i] < a[i + 1]) {
                    return false;
                }
            } else {
                if (a[i] > a[i + 1]) {
                    return false;
                }
            }

        }
        return true;
    }
    //optimal code done
}
