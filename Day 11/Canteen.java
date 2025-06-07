public class Canteen {
    String prodname;
    int price;
    int quantity;

    public Canteen() {
        System.out.println("welcome to canteen ");
    }

    public Canteen(String prodname, int price, int quantity) {
        // this.prodname
        // customer1.prodname
        this.prodname = prodname;
        this.price = price;
        this.quantity = quantity;
        // System.out.println(this.prodname + " " + this.price + " " + this.quantity);
    }

    public Canteen(String prodname, int price) {
        this.prodname = prodname;
        this.price = price;
        // System.out.println(this.prodname + " " + this.price);
    }

    public Canteen(Canteen customer1) {
        // customer3.prodname=customer1.prodname;
        this.prodname = customer1.prodname;
        this.price = customer1.price;
        this.quantity = customer1.quantity;
    }

    public static void main(String[] args) {
        Canteen customer1 = new Canteen("burfy", 5, 3);
        // customer1.prodname="burfy";
        // customer1.price=5;
        // customer1.quantity=3;
        Canteen customer2 = new Canteen("sweetcandy", 1);
        Canteen customer3 = new Canteen(customer1);
        System.out.println(customer3.prodname);
        customer3.prodname="rose milk";
        System.out.println(customer1.prodname);
        System.out.println(customer3.prodname);
        
    }
}