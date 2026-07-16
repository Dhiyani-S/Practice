import java.util.*;
class task5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[]a1= new int [n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
            sum+=a1[i];
        }
        System.out.println("the sum of array elements:"+sum);
    }
}