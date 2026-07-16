import java.util.*;
class task7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[]a1= new int [n];
        int evencount=0;
        int oddcount=0;
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
            if(a1[i]%2==0) evencount++;
            else oddcount++;
        }
        System.out.println("Even count:"+evencount);
        System.out.println("Odd count:"+oddcount);
    }
}