import java.util.*;
public class task19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements array1: ");
        int m = sc.nextInt();
        int[] a1= new int[m];
        System.out.println("Enter array elements:");
        for (int i =0; i < m; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.print("Enter number of elements array2: ");
        int n = sc.nextInt();
        int[] a2= new int[n];
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }
        for(int j:a1){
        for(int k=0;k<m;k++){
            if (j==a2[k]) System.out.println("common elements between two arrays:"+a2[k]);
        }
        }
    }
}
