public class Demo {

    public static void main(String[] args) {
        String s="google";
        char c[]= s.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<j)
        {
            while(i<j && !isVowels(c[i]))
            {
                i++;
            } 
            while(i<j && !isVowels(c[j]))
            {
                j--;
            }
            if(i<j)
            {
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
            }
        }
        String res=new String(c);
        System.out.println(res);

    }
   static  boolean  isVowels(char c)
    {
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'|| c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}