public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Person per = new Person(12, "blue", true);
        Person peper = new Person(25, "red", false);

        per.display();
        per.buytaxes();

        per.display();
        peper.buytaxes();
    }
}
