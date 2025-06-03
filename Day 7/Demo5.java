public class Demo5 {
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 2, 3, 2, 2, 4, 4 };
        int n = a.length;
        boolean b[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!b[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        b[j] = true;
                    }
                }
                if (count > 0) {
                    System.out.println(a[i] + " comes " + count + " times");
                }
            }
        }
    }
}
