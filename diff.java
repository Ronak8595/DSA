import java.io.*;
import java.util.*;

public class diff{
    public static void diffOfTwoArrays(int [] a1, int [] a2){
    
    int c =0;
    int i = a1.length - 1;
    int j = a2.length - 1;
    int size = a2.length;
    int [] ans = new int [size];
    int k =ans.length - 1;
    while(k >=0){
       int diff = c;
        if(j>=0){
            diff+= a2[j];
        }
        if(i>=0){
            diff-=a1[i];
        }
        if (diff<0){
            diff += 10;
            c = -1;
        }
        ans [k] = diff;
        i--;
        j--;
        k--;

    }
    for(int ele : ans){
        System.out.println(ele);
    }

}
public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int [] a1=new int [n1];
    for(int i=0 ;i<n1 ;i++){
        a1[i]= scn.nextInt();
    }
    int n2 = scn.nextInt();
    int [] a2=new int [n2];
    for(int i=0 ;i<n2 ;i++){
        a2[i]= scn.nextInt();
    }
    diffOfTwoArrays(a1,a2);
 }

}