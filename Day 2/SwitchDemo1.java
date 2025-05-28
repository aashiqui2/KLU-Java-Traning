
public class SwitchDemo1 {
    public static void main(String[] args) {
        int a=4;
       /* System.out.println(a++);
       System.out.println(++a);
       System.out.println(a--);
       System.out.println(--a); */

       switch(a){
        case 1: a++;
        case 2: ++a;
        case 3: --a;
        case 4: a--;
        case 5: a++;
        case 6: a--;
        case 7: --a;
        case 8: a++;
        case 9: a++;
       }
       System.out.println(a);

    }
}
