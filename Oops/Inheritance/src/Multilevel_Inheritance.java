class Animal{
    void cat(){
        System.out.println("Cat is sleeping");
    }
}
class Animal3 extends Animal{
    void dog(){
        System.out.println("Dog is eating");
    }
}
class Animal4 extends Animal3{
    void rat(){
        System.out.println("Rat is dancing");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Animal4 an=new Animal4();
        an.cat();
        an.dog();
        an.rat();
    }
}
