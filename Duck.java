/* Toy test implementation to get familiar with Design Patterns
 */
public abstract class Duck {
    public Duck () {
    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Duck always Float!!");
    }
}
