public class SwitchDemo {

    public static void main(String[] args) {
        // switch statemnt
        /* -integeral
         swicth(expression)
         {
         case 1: block of code;
                break;
         case 2: block of code;
                 break;
         default: block of code;        
         }
         */

        /*  int a=5;
         if(a==1)
         {

         }
         else if(a==2)
         {

         }
         else if(a==3)
         {

         }
         else if(a==4){

         }
         else if(a==5)
         {

         } */

        // ! Jump statement
         /*  1) break;
          2) continue; */
        int day=3;
         switch(day)
         {
         case 1: System.out.println("Mon");
                 break;
         case 2: System.out.println("Tue");;
                 break;
         case 3: System.out.println("Wed");;
                 break;
         case 4: System.out.println("Thur");;
                 break;
         case 5: System.out.println("Fri");;
                 break;
         case 6: System.out.println("Sat");;
                 break;
         case 7: System.out.println("Sun");;
                 break;
         default:System.out.println("not valid day");      
         }
    }
}