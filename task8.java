import java.util.*;
class task8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[]a1= new int [n];
        int poscount=0;
        int negcount=0;
        int zercount=0;
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
            if(a1[i]>0)
                poscount++;
            else if(a1[i]<0) 
                negcount++;
            else 
                zercount++;
        }
        System.out.println("Positive count:"+ poscount);
        System.out.println("Negative count:"+ negcount);
        System.out.println("Zero count:"+ zercount);
    }
}