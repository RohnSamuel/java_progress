import java.util.*;

public class Oopsbasics {
    public static void main(String[] args) {
      //System.out.println("Hello, World!");
      Student s1=new Student("Dante",20,'A');
      Student s2=new Student("Lady",25,'A');
      Student s3=new Student("Nero",22,'S');
      Game g1=new Game("Metal Gear",8);
      Game g2=new Game("Yakuza 4",9);
      Game g3=new Game("Nightrunners",10);
      System.out.println(g2.name);
      System.out.println(g2.rating);
      System.out.println(s2.grade);
      System.out.println(s1.age);
      
    }
}
class Student{
  String name;
  int age;
  char grade;
  Student(String name,int age,char grade){
    this.name=name;
    this.age=age;
    this.grade=grade;
  }
}

class Game{
  String name;
  int rating;
  Game(String name, int rating){
    this.name=name;
    this.rating=rating;
  }
}