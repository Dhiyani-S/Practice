import java.util.*;
public class task20{
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
        Arrays.sort(a1);
        Arrays.sort(a2);
        int[] a3= new int[m+n];
        for(int i=0;i<m;i++){
            a3[i]+=a1[i];
        }
        
        for(int i=0;i<n;i++){
            a3[m+i]+=a2[i];
        }
        System.out.print(Arrays.toString(a3));
        }
    }
