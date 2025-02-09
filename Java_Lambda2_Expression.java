
abstract class Vehicle {

    abstract void drive();
}

public class Java_Lambda2_Expression {
    public static void main(String[] args) {
        // anonymous class implementation

        Vehicle v = new Vehicle(){
        @Override
        void drive(){
        System.out.println("i am Driving a car");
        }
        };
        v.drive();

        // lambda cant be implement in the abstract class here only impliments the
        // interface class

    }
}
