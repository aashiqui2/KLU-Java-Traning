public class NestedIfDemo {
    public static void main(String[] args) {
        //if inside if 
        boolean hasHallTicket=true;
        int percentage=60;
        if(hasHallTicket)
        {
            if(percentage>=60)
            {
                System.out.println("write exam");
            }
            else{
                System.out.println("pay fine to write exam");
            }
        }
        else{
            System.out.println("not eligible to write exam");
        }
    }
}
