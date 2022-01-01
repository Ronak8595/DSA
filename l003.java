import java.util.*;
public class l003{
    public static int decimalToBinary(int n){
        int ans = 0;
        int pow =1;
        while(n!=0){
            int rem = n%2;
            n/=2;
            ans += rem * pow;
            pow = pow * 10;
        }
        return ans;
        }
public static void main(String[]ars){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int binary = decimalToBinary(n);
        System.out.println(binary);
    }
}