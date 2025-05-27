public class Variables {
    public static void main(String[] args) {
        /*
         * cannot start with numbers
         * other than the $ and _ we cannot able use any special symbols
         * variable name does not contain spaces
         */

        int a = 10;// valid
        int a_ = 20;// valid
        // int 123a=30;invalid
        int abc123 = 40;// valid
        int abc_a = 50;// valid
        int $ = 60;
        int abc$ = 70;// valid
        // int abc aa=20;//invalid
        int abc_123 = 80; // valid
        System.out.println($);
        int _=10;
        // System.out.println(_);
        //!underscore not allowed here
    }
}
