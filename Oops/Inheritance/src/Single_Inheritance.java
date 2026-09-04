class Animal1{
    void cat(){
        System.out.println("meow..meow..");
    }
}
class Animal2 extends Animal1{
    void rat(){
        System.out.println("kich..kich..");
    }
}
public class Single_Inheritance {
    public static void main(String[] args) {
        Animal2 an=new Animal2();
        an.cat();
        an.rat();
    }
}
