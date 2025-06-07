package tamilnadu.chennai;
public class BranchOffice extends Office {
    public static void main(String[] args) {
        BranchOffice off=new BranchOffice();
        off.work();
        off.celebrate_local_function();
        off.recruit();
    }
    public void celebrate_local_function()
    {
        System.out.println("celebrating...");
    }
    
}
