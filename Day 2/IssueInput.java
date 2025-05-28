import java.util.Scanner;
public class IssueInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /* String s=sc.next();
        String s1=sc.nextLine();
        System.out.println(s);
        System.out.println(s1); */

        int a=sc.nextInt();
        // sc.nextLine();
        String str=sc.nextLine();
        System.out.println(a);
        System.out.println(str.trim());
    }
}
