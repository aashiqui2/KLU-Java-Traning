public class Child extends Parent {
    Child() {
        // super();
        System.out.println("i am from child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.work();
    }

    // ! do not reduce the visibility
    @Override
    public void work() {
        System.out.println("workign in It");
    }
}
