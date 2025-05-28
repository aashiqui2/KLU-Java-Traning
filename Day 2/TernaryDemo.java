
public class TernaryDemo {
    public static void main(String[] args) {
        int a = 2;
       /*  if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        } */

        //! (condition)?T:F;
        String result = (a % 2 == 0) ? "even" : "odd";
        System.out.println(result);
    }
}
