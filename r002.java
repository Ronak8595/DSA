import java.util.*;

        public class main{
        public static void isPrime (int a){
            int c = 0;
        for (int b=2 ;b*b<=a;b++){
    
         if(a % b == 0){
             c++;
             break;
            }
        }
        if(c >= 1){
             System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
        }
   
        public static void main (String [] args){
            
            Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();
            for(int n=0;n<=t;n++){
            int s =scn.nextInt();
            
            isPrime(s);

        }
        }
}