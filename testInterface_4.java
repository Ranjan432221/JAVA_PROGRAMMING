interface Drawable {  
    void draw();  
    
    default void msg() {
        System.out.println("default method");
    }  

    default void sms() {
        System.out.println("this is an SMS in the main interface");
    }
     default void sm() {
        System.out.println("this is an SMS in the Rectangle class");
    }
}  

class Rectangle implements Drawable {  
    public void draw() {
        System.out.println("drawing rectangle");
    }  
    
    // @Override
    // public void sm() {
    //     System.out.println("this is an SMS in the Rectangle class");
    // }
}  

public class testInterface_4 {
    public static void main(String[] args) {
        Drawable d = new Rectangle();  
        d.draw();  
        d.msg(); 
        d.sms();
        d.sm();
      
    }
}
