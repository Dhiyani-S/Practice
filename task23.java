import java.util.*;
class task23{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element in an array:");
        int n=sc.nextInt();
        int [] a1=new int [n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1)+": ");
            a1[i]=sc.nextInt();
        }
        boolean found=false;
        System.out.println("Enter the Target :");
        int target=sc.nextInt();
        {
            for(int i=0;i<n;i++){
            if(target==a1[i]){
                found=true;
                System.out.println("Element found  at the index "+i);
                break;
            }
        }
        if(!found){
             System.out.println("Element not found ");
        }
    }
}
}
