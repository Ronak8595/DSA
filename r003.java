import java.util.*;
public class r003{
//     public static int binarySearch(int []arr,int x){
//     int lo =0;
//     int hi = arr.length -1;
//     int mid = (hi + lo)/2;
//     while(lo < hi){
//         if (arr[mid] == x){
//             return mid;
//         }
//         else if(arr[mid] <= x){
//             lo = mid +1;
//         }
//         else{
//             hi = mid -1;
//         }
//     }
//     return -1;

// }
//     public static void main (String[]args){
//         int [] arr ={4,6,8,10,12,14,16,18,20,22,24};
//         int x =20;
//         int ans = binarySearch(arr,x);
//         System.out.println(ans);
//     }
// }

// //---------------------------------8888888888888888--------------------------------------------
// public static void diffOfArrays(int [] a1; int [] a2){
//     int diif =0;
//     int c =0;
//     int i = a1.length - 1;
//     int j = a2.length - 1;
//     int size = a2.length;
//     int [] ans = new int [size];
//     int k =ans.length - 1;
//     while(a2 !=0){
//         diff = c;
//         if(j>=0){
//             diff+= a2[j];
//         }
//         if(i>=0){
//             diff-=a1[i];
//         }
//         if (diff<0){
//             diff += 10;
//             c = -1;
//         }
//         ans [k] = diff;
//         i--;
//         j--;
//         k--;

//     }
//     for(int ele : ans){
//         System.out.println(ele);
//     }
public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int [][] arr = new int[n][m];
    for (int i= 0;i< n; i++){
        for( int j =0; j< m; j++){
            arr[i][j]= scn.nextInt();
         }
        }
    int minc =0;
    int minr =0;
    int maxc = m - 1;
    int maxr = n - 1;
    int total = m*n;
    int count =0;
    while(count < total){
        for(int i=minr; i<=maxr && count < total; i++){
            System.out.println(arr[i][minc]);
            count++;
            }
             minc++;
        for(int i=minc; i<=maxc && count < total; i++){
            System.out.println(arr[maxr][i]);
            count++;
            }
            maxr--;
        for(int i=maxr; i>=minr && count < total; i--){
            System.out.println(arr[maxc][i]);
            count++;
            }
             maxc--;
        for(int i=maxc; i>=minc && count < total; i--){
            System.out.println(arr[minr][i]);
            count++;
            }
             minr++;
        }    
    }
}
