import java.util.*;
class task3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[]a1= new int [n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        Arrays.sort(a1);
        System.out.println("the largest element in an array:"+a1[n-2]);
    }
}