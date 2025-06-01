public class Demo {

    public static void main(String[] args) {
        int n=15,pos=2;
        int mask=~(1<<pos);
        System.out.println(mask);
        n=n&mask;
        System.out.println(n);
    }
}