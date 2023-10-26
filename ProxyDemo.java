import proxy.*;

public class ProxyDemo {
    public static void main(String[] args) {
    ExpensiveObject object = new ExpensiveObjectProxy();
    ExpensiveObject object2 = new ExpensiveObjectProxy();
    object.process();
    object.process();
    object2.process();
}
}
