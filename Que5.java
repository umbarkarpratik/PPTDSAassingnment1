package PrePlacementTraning.DSA;

public class Que5 {
    public static void main(String[] args) {
        int arr1[]={1,2,5,0,0,0};
        int arr2[]={2,3,6};
        int p=0;
        
        for(int i=3;i<arr1.length;i++){
               
                arr1[i]=arr2[p++];
            
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    int tem=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=tem;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
                System.out.print(arr1[i]+" ");
        }
    }
}
