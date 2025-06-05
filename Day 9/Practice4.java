public class Practice4 {

    public static void main(String[] args) {
        String s1="a";
        String s2="ab";
        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int hash[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            hash[s1.charAt(i)-'a']++;
            hash[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(hash[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}