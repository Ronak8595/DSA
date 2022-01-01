import java.util.*;
  
  public class anyBaseAdd{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
        int c = 0;
       
        int ans = 0;
        int pow = 1;
        while(n1!=0||n2!=0||c!=0){
            int sum = n1 % 10 + n2 % 10 + c;
            if(ans>=b){
                c+=1;
            }
            c = sum/b;
            sum %=b;
            n1/=10;
            n2/=10;  
            ans+= sum*pow;
            pow*=10;
           
        }
        return ans;

   }
  }