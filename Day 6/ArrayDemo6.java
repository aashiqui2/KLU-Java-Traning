public class ArrayDemo6 {
    public static void main(String[] args) {
        int a[]={55,20,11,3,90};
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
         for(int i=0;i<a.length;i++)
        {
            if(a[i]<first)
            {
                second=first;
                first=a[i];
            }
            else if(a[i]<second &&a[i]!=first)
            {
                second=a[i];
            }
        }
        System.out.println(second);
    }
}
