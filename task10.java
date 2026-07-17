import java.util.*;
class task10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[]a1= new int [n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        for(int j=n-1;j>=0;j--){
            System.out.print(a1[j]);
        }
    }      
        }
       
