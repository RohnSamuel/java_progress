import java.util.*;

public class Employee_data_collection {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String n=s.next();
      int sa=s.nextInt();
      int a=s.nextInt();
      Employee e=new Employee(n,sa,a);
      e.display();
      
    }
}
class Employee{
  String name;
  int salary;
  int age;
  Employee(String name,int salary,int age){
    this.name=name;
    this.salary=salary;
    this.age=age;
  }void display(){
    System.out.println(name+"\n"+salary+"\n"+age);
  }
}