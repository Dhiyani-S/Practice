import java.util.*;
class task12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[]a1= new int [n];
        int[]a2= new int [n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
            a2[i]+=a1[i];
        }
        Arrays.sort(a2);
        for(int i=0;i<n;i++){
          if(a1[i]!=a2[i]) count++;
        }
        if (count>0) System.out.println("Array is not sorted");
        else System.out.println("Array is sorted");
    }      
        }
