package PrePlacementTraning.DSA;

import java.util.Scanner;



public class Que3 {
    
     public  static int sorting(int[] arr,int l,int h, int target) {
        
       
            while(l<=h){
                int m=l+(h-l)/2; 
                if(arr[m]==target){
                   return m;
                  //  System.out.println("answer"+m);
                  //  break;
                } 
                if(arr[m]<target){

                    l=m+1;
                }
                else if(arr[m]>target)
                {
                    h=m-1;
                }
                  
            }    
   
        
        return -1;
        
        
        

        
    }
    public static void main(String[] args) {
         //enter array of integer
        System.out.println("enter the number of integer");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        

        int arr[]=new int[n];
        System.out.println("Enter the element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value");
        int target=sc.nextInt(); 

        
        int res=sorting(arr,0,arr.length-1,target);
        if(res!=-1)
        System.out.println(res);
        else
        System.out.println("element not found");

    }

   
}
