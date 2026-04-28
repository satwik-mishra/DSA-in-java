package Arrays;
// swap alternate elements in an array 
// {1,2,3,4,5,6} --> {2,1,4,3,6,5}
public class basics08 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i=0;
        int j=i+1;
        int size=arr.length;
        while(i<size && j<size)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i=j+1;
            j=i+1;
        }
        
        for(int k=0;k<size;k++)
        {
            System.out.println(arr[k]);
        }
    }
}
