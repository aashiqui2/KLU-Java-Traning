public class Demo {
    public static void main(String[] args) {
         String binary="0001";
         int decimal=0;
         int power=0;
         for(int i=binary.length()-1;i>=0;i--)
         {
            char bit=binary.charAt(i);
            if(bit=='1') 
            {
                decimal+=(int)Math.pow(2,power);
            }
            power++;
         }
         System.out.println(decimal);
    }
}
