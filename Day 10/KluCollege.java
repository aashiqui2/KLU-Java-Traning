package tamilnadu.madurai;

public class KluCollege {
    public static void main(String[] args) {
        KluCollege Principal=new KluCollege();
        Principal.Canteen();
        Principal.swimmingpool();
    }
    public void Canteen() {
        System.out.println("food is good");
    }
    private void guestHouse()
    {
        System.out.println("only for staff's");
    }
    void ClassRoom()
    {
        System.out.println("VLSI lab");
    }
    void hostel()
    {
        System.out.println("hostel is good");
    } 
    private void swimmingpool()
    {
        System.out.println("only for staff's");
    }
    void turf()
    {
        System.out.println("open at 5pm closed at 7pm");
    }
}
