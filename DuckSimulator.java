public class DuckSimulator {
    public static void main(String[] args) {
        Duck d = new MallordDuck();
        d.display();
        d.performFly();
        d.performQuack();
    }
}
