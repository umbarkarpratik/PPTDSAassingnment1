package PrePlacementTraning.DSA;
import java.util.Scanner;


public class Que2 {
    static int k=0;
     public static int sol(int[] arr, int val) {
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                k=arr[i];
            }
        } return k;
       
    }
    public static void main(String[] args) {
        
        int k=0;

        //enter array of integer
        System.out.println("enter the number of integer");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        

        int arr[]=new int[n];
        System.out.println("Enter the element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      
        //Enter val ,if  it occur left the break the loop
        System.out.println("enter the value");
        int val=sc.nextInt(); 

        int res=sol(arr,val);
        System.out.println(res);
        
    }
}

   

   
