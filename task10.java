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
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a1[i]==a1[j])
                System.out.println("duplicate elements in an array:"+a1[i]);
            }
        }
        }
}