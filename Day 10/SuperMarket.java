public class SuperMarket {
    static  String name = "Reliance Mall";
    int price;
    int discount;
    String ProductName;

    public SuperMarket() {
        System.out.println("welcome to the mall");
    }
    public SuperMarket(String ProductName,int price,int discount) {
       this.ProductName=ProductName;
       this.price=price;
       this.discount=discount;
    }
    public static void main(String[] args) {
        SuperMarket product1 = new SuperMarket();
        // product1.ProductName = "DarkFantasy Biscuits";
        // product1.price = 40;
        // product1.discount = 5;
        SuperMarket product2 = new SuperMarket();
        // product2.ProductName = "Ice-cream";
        // product2.price = 25;
        // product2.discount = 5;

        SuperMarket product3 = new SuperMarket("fruitsalad",30,5);
        System.out.println(product3.ProductName);
        System.out.println(name);

    }
}
