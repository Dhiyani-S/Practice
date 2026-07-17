import java.util.*;
class task11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> a2= new HashSet<>();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[]a1= new int [n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
            a2.add(a1[i]);
        }
            System.out.println("After Removing  duplicate elements from an array:"+ a2);
            System.out.print(a2);
           
    }      
        }
