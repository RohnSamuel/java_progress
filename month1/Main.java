import java.util.*;
//trying to create a abstraction from oops
public class Main {
    public static void main(String[] args) {
      Diagram s=new Square();
      s.shape();
      Diagram s1=new Rectangle();
      s1.shape();
      Diagram s2=new Triangle();
      s2.shape();
      Diagram s3=new Circle();
      s3.shape();
    }
}
abstract class Diagram{
  abstract void shape();
}
class Square extends Diagram{
  void shape(){
    System.out.println("Square: equal sides");
  }
}

class Rectangle extends Diagram{
  void shape(){
    System.out.println("Rectangle: opposite sides equal");
  }
}
class Triangle extends Diagram{
  void shape(){
    System.out.println("Traingle: three sides may or may not be equal");
  }
}
class Circle extends Diagram{
  void shape(){
    System.out.println("Circle: infinite triangle sides");
  }
}
