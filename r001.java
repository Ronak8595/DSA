import java.util.*;
public class r001{
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
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
}