import java.util.*;

public class Hour_glass_pattern {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int k=s.nextInt();
      for(int i=0;i<=k;i++){//row
        for(int j=0;j<=k;j++){ //column
          if(i==0 || i==k || i==k-j || i==j){
            System.out.print('*');
          }
          else{
            System.out.print(' ');
          }
        }
        System.out.println();
      }
    }
}

