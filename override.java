public class override {
    void show()
    {
        System.out.println("parent show");
    }
}
class child extends override{
    @Override void show()
    {
        System.out.println("child show");
    }
}
class Main{
    public static void main(String[] args) {
        Override obj = new override();
        obj.show();
    }
}
