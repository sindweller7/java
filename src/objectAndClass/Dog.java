package objectAndClass;

public class Dog {
    public void jump(){
        System.out.println("jump");
    }
    
    public void run(){
        Dog dog1 = new Dog();
        dog1.jump();
        System.out.println("run");
    }
}
