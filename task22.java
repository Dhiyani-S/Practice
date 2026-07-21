import java.util.*;
class task22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element in an array:");
        int n=sc.nextInt();
        int [] a1=new int [n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1)+": ");
            a1[i]=sc.nextInt();
        }
        Arrays.sort(a1);
        int low=0;
        int high=n-1;
        boolean found=false;
        System.out.println("Enter the element to search:");
        int key=sc.nextInt();
        while(low<=high){
            int mid =low+(high-low)/2;
            if(a1[mid]==key){
                 System.out.println("Element found at position : " + (mid+1));
                found = true;
                 break;
            }
            else if(a1[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(!found){
             System.out.println("Element not found ");
        }
    }
}
