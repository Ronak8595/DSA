import java.util.Scanner;

public class l001_Theory {
    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();   // setter
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // getter
        }
        System.out.println();
    }

    public static boolean findElement(int[] arr,int data){

    }

    public static int maximum(int[] arr){

    }

    public static int minimum(int[] arr){

    }



    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        takeInput(arr);
        printArray(arr);

    }
    public static int maximum(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
           max= Math.max(max,arr[i]);
        }
        return max;
    }
} 


//*********************************************_________________________________ */
 for(int h = height ; h>=1 ; h--){
            for(int i = 0; i<arr.length; i++){
                if(arr[i] >= h){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
//*************************************************************************__________________________________ 
public static int binarySearch(){
    int lo =0;
    int hi = arr.length -1;
    int mid = (hi + lo)/2
    while(lo <= hi){
        if (arr[mid] == x){
            return mid;
        }
        else if(arr[mid] <= x){
            lo = mid +1;
        }
        else{
            hi = mid -1;
        }
    }

}

//_______________________________________________________________________________________________
import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean saddlePrice(int []arr){
        for(int i=0; i<arr.length; i++){
            int rmin = arr[i][0];
            int col = 0;
            boolean saddlePrice = true;
            for(int j=1; j<arr.length; j++){
                if(rmin > arr[i][j]){
                    rmin = arr[i][j];
                    col = j;
                }
            }
        }
        for(int k =0; k<arr.length; k++){
            if(rmin > arr[k][col]){
                saddlePrice = false;
                break;
            }
        }
        if(saddlePrice){
            System.out.println(rmin);
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int [][] arr= new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]= scn.nextInt();
            }
        }
        saddlePrice(arr);
        
    }

}