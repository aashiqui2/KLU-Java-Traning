public class Demo7 {
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        int sum =0;

        while(n>0){
            int digit = n%10;
            sum += (int)Math.pow(digit,3);
            n = n/10;
        }
        if(sum == original){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
