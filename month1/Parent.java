import java.util.*;
//trying the single inheritance
public class Single_inheritance{
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Child1 c=new Child1();
      c.show();
      c.info();
    }
}
class Parent{
  String father="Rohan";
  String mother="Julia";
  void show(){
    System.out.println("This is the parent class being printed");
  }
}
class Child1 extends Parent{
  void show(){
    System.out.println("This is the child class being printed");
  }
}