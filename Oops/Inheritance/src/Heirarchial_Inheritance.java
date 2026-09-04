class Cat1{
    void sleep(){
        System.out.println("Cat is sleeping");
    }
}
class Cat2 extends Cat1{
    void eat(){
        System.out.println("Cat is eating");
    }
}
class Cat3 extends Cat1{
    void drink(){
        System.out.println("Cat is drinking");
    }
}
public class Heirarchial_Inheritance {
    public static void main(String[] args) {
        Cat3 ca=new Cat3();
        ca.drink();
        ca.sleep();
    }
}
