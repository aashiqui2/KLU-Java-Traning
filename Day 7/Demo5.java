import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 2, 3, 2, 2, 4, 4 };
        int n = a.length;
        //! brute force approach
       /* boolean b[] = new boolean[n];
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
        } */
    //! Time complexity:O(n^2)

    //! Optimal approach
      Arrays.sort(a);
      int max=0;
      for(int val:a)
      {
        if(val>max)
        {
            max=val;
        }
      }
      int dp[]=new int[max+1];
      for(int i=0;i<n;i++)
      {
        dp[a[i]]++;
      }
      for(int i=0;i<max+1;i++)
      {
        if(dp[i]>0)
        {
            System.out.println(i+" comes "+dp[i]+" times");
        }
      }
    }
}
