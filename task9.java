import java.util.*;
class task9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[]a1= new int [n];
        List<Integer> a2 = new ArrayList<>();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
             for(int i=n-1;i>=0;i--){
                 a2.add(a1[i]);
        }
        System.out.println("array elements in reverse order:"+ a2);
    }
}