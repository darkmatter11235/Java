public class MallordDuck extends Duck {
    public MallordDuck () {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Flying like a MallordDuck!!");
    }
}
