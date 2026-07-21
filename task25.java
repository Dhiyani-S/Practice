import java.util.*;
class task25{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element in an array:");
        int n=sc.nextInt();
        int [] a1=new int [n];
        int count=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1)+": ");
            a1[i]=sc.nextInt();
        }
        boolean found=false;
        System.out.println("Enter the Target :");
        int target=sc.nextInt();
        {
            for(int i=n-1;i>0;i--){
            if(target==a1[i]){
                count++;
            }
        }
        if(!found){
             System.out.println("Element not found ");
        }
    }
    System.out.println(Arrays.toString(a1));
    System.out.println("Count occurrences of a given element:"+count);
}
}
