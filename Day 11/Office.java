package tamilnadu.chennai;
public class Office {
    Office()
    {
        System.out.println("i am from office class");
    }
    public static void main(String[] args) {
        Office office=new Office();
        office.work();
    }
    public void work()
    {
        System.out.println("working in office");
    }
    protected void wfh()
    {
        System.out.println("working in home");
    }
    void recruit()
    {
        System.out.println("recruitment");
    }
    private void do_business_Plan()
    {
        System.out.println("planning....");
    }
}
