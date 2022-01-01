import java.util.*;
public class l002{
    
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        int n = scn.nextInt();
        int nst1 =1;
        int nsp = n-2;
        int nst2 = 1;
        for(int r=1;r<=n;r++){
        for(int cst1=1;cst1<=nst1;cst1++)
            System.out.print("*\t");
        
        for(int csp=1;csp<=nsp;csp++)
            System.out.print("\t");
        
        for(int cst2=1;cst2<=nst2;cst2++)
            System.out.print("*\t");
        
        nst1+=1;
        nsp-=1;
        nst2+=1;
        System.out.println();
        }
    }
}