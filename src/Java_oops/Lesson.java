package Java_oops;

public class Lesson {
    int x=5;
     int y=25;
    final double PI=3.14;
static void sayHi(){
    System.out.println("Hey Static method");
}
    public void sayHello(){
        System.out.println("Hello Non Static method");
    }

    public Lesson(){
    x=40;
    }
//Final keyword can be used when we dont required override

    public static void main(String[] args) {
        Lesson lecture1=new Lesson();
//        lecture1.y=50;
        System.out.println(lecture1.x);
        System.out.println(lecture1.y);
        sayHi();
        lecture1.sayHello();
        System.out.println("value of pi="+ lecture1.PI);

    }
}
