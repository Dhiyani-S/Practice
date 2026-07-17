import java.util.*;
public class task21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements array: ");
        int m = sc.nextInt();
        int[] a1= new int[m];
        System.out.println("Enter array elements:");
        for (int i =0; i < m; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.print("Enter Target Element:");
        int n = sc.nextInt();
        for (int i =0; i < m; i++) {
            if(n==a1[i]){
                int c=i+1;
                System.out.print("Targeted Element is found at "+ c +" position");
            }
        }
        }
    }
