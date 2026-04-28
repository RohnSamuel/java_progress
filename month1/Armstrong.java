import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int nn=n;
      int ans=0;
      int dig=0;
      while (n>0){
        dig=n%10;
        ans+=Math.pow(dig,3);
        n/=10;
      }
      if(ans==nn){
        System.out.println("It is a armstrong number ");
      }else{
        System.out.println("It is not");
      }
    }
}