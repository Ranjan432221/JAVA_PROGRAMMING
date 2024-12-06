@FunctionalInterface
interface LambdaFind {
    void bark();
}

public class Lambda {
    public static void main(String[] args) {
        // Lambda expression implementation
        LambdaFind d = () -> System.out.println("this is a lambda expression in Java");
        d.bark();

        // Anonymous class implementation
        LambdaFind l = new LambdaFind() {
            @Override
            public void bark() {
                System.out.println("this is an anonymous class of the lambda program");
            }
        };
        l.bark();
    }
}
