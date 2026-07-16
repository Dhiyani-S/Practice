import java.util.*;
class task9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[]a1= new int [n];
        System.out.println("Enter elements:");
        for(int i=n-1;i>=0;i--){
            a1[i]=sc.nextInt();
        }
                  System.out.print(Arrays.toString(a1));
           
    }      
        }
       
