import java.util.*;
class task13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        Integer []a1= new Integer [n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        Arrays.sort(a1, Collections.reverseOrder());
        System.out.println("Descending order:"+Arrays.toString(a1));
    }      
        }
