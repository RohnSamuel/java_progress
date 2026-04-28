import java.util.*;
//trying the hirarchical inheritance
public class Single_inheritance{
    public static void main(String[] args) {
      //System.out.println("Hello, World!");
      Child1 c=new Child1();
      c.show();
      Child2 c1=new Child2();
      c1.display();
      System.out.println(c1.father);
    }
}
class Parent{
  String father="Robben";
  String mother="Julia";
  void show(){
    System.out.println("This is the parent class being printed");
  }
}
class Child1 extends Parent{
  void show(){
    System.out.println("This is the child1 class being printed");
  }
}
class Child2 extends Parent{
  String name="Arjen";
  void display(){
    System.out.println(name);
  }
}