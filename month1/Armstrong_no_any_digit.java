import java.util.*;

public class Armstrong_no_any_digit {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int n1=n;
      int nn=n;
      int ans=0;
      int dig=0;
      int count=0;
      while(n>0){
        int d=n%10;
        count++;
        n/=10;
      }
      while (n1>0){
        dig=n1%10;
        ans+=Math.pow(dig,count);
        n1/=10;
      }
      if(ans==nn){
        System.out.println("It is a armstrong number ");
      }else{
        System.out.println("It is not");
      }
    }
}
