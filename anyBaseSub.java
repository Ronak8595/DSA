import java.util.*;
  
  public class anyBaseSub{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
      int c =0;
      int ans = 0;
      int pow = 1;
      while(n1!=0||n2!=0||c!=0){
          int diff =n1%10 - n2%10 +c;
          if(diff<0){
              diff = diff + b;
              c-=1;
          }
          else{
              c=0;
          }

          n1/=b;
          n2/=b;
          ans+=diff*pow;
          pow*=10;

      } 
      return ans;
   }
  
  }