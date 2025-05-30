public class Demo4 {

    public static void main(String[] args) {
        int a=12;
        int b=18;
        //! Brute force approach
        // int max=(a>b)?a:b;
        // while(true)
        // {
        //     if(max%a==0 &&max%b==0)
        //     {
        //         System.out.println(max);
        //         break;
        //     }
        //     max++;
        // }

        //! brute force
        // int min=(a<b)?a:b;
        // int div=2;
        // int last=0;
        // while(div<=min/2)
        // {
        //     if(a%div==0 &&b%div==0)
        //     {
        //         last=div;
        //     }
        //     div++;
        // }
        // System.out.println(last);

        //! Eculidean Algorithm
        int mul=a*b;
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;
        }
        System.out.println(a);

        System.out.println("lCM:"+ mul/a);


    }
}