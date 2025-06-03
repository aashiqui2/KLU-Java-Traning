import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        int a[]={0,1,0,3,12};
        //! brute force approach
        // int cntZero=0;
        // int n=a.length;
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]==0)
        //     {
        //         cntZero++;
        //     }
        // }
        // int idx=0;
        // for(int i=0;i< n;i++)
        // {
        //     if(a[i]!=0)
        //     {
        //         a[idx]=a[i];
        //         idx++;
        //     }
        // }
        // for(int i=0;i<cntZero;i++)
        // {
        //     a[idx]=0;
        //     idx++;
        // }
        // System.out.println(Arrays.toString(a));
        //Time complexity:O(n)+O(n)+O(n)=O(3*n)

        //! Optimal approach-O(n)
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]!=0){
                int t=a[j];
                a[j]=a[i];
                a[i]=t;
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
